//package com.upic;
//
//import java.io.UnsupportedEncodingException;
//import java.util.Base64;
//
//public class Test {
//	public static void main(String[] args) throws UnsupportedEncodingException {
//		
//		final String text = "字串文字";
//		final byte[] textByte = text.getBytes("UTF-8");
//		// 编码
//		final String encodedText = encoder.encodeToString(textByte);
//		System.out.println(encodedText);
//		// 解码
//		System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
//
////		final Base64.Decoder decoder = Base64.getDecoder();
////		final Base64.Encoder encoder = Base64.getEncoder();
////		final String text = "字串文字";
////		final byte[] textByte = text.getBytes("UTF-8");
////		// 编码
////		final String encodedText = encoder.encodeToString(textByte);
////		System.out.println(encodedText);
////		// 解码
////		System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
//	}
//}
