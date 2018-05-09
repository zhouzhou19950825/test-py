package com.upic;

import java.io.*;

public class PyCaller {
    private static final String DATA_SWAP = "temp.txt";
    private static final String PY_URL = System.getProperty("user.dir") + "\\test.py";

    public static void writeImagePath(String path) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(DATA_SWAP)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        pw.print(path);
        pw.close();
    }

    public static String readAnswer() {
        BufferedReader br;
        String answer = null;
        try {
            br = new BufferedReader(new FileReader(new File(DATA_SWAP)));
            answer = br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return answer;
    }

    public static void execPy() {
        Process proc = null;
        try {
//            System.out.println(System.getProperty("user.dir") + "\\test.py");
            proc = Runtime.getRuntime().exec("python " + PY_URL);
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        writeImagePath("E:\\j2eeworkspace\\gitworkspace\\hsy\\hsy-web\\test-java-py\\examplePictures\\2.jpg");
        execPy();
//        System.out.println(readAnswer()); 	
    }
}