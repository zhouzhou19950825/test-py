package com.upic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

public class FirstJythonScript {

	private static boolean waitFor;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process proc = Runtime.getRuntime().exec("python test1.py"); // 执行py文件
		StringBuffer sb=new StringBuffer();
		try {
			String name = "dongshuai \n";
			// proc.waitFor();
			new Thread(() -> {

				InputStreamReader stdin = new InputStreamReader(proc.getInputStream());
				LineNumberReader input = new LineNumberReader(stdin);
				String line;
				try {
					while ((line = input.readLine()) != null) {
						System.out.println("line:"+line);
						sb.append(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();

			new Thread(() -> {
				InputStreamReader stdin = new InputStreamReader(proc.getErrorStream());
				LineNumberReader input = new LineNumberReader(stdin);
				String line;
				try {
					while ((line = input.readLine()) != null) {
//						System.out.println("line:" + line);// 得到输出
						sb.append(line+"/n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
			new Thread(() -> {
				OutputStream outputStream = proc.getOutputStream();
				try {
					outputStream.write(name.getBytes());
					outputStream.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}).start();

			waitFor = proc.waitFor(2,TimeUnit.SECONDS);
			if(!waitFor) {
				proc.destroy();
				System.out.println(sb.toString());
			}
		} catch (

		Exception e) {
			proc.destroy();
			e.printStackTrace();
		}
	}
}