package com.nt.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class SecurityUtils {
	
	public static String encode(String plainText) {
		Encoder encoder=Base64.getEncoder();
		return encoder.encodeToString(plainText.getBytes());
	}
	public static String decode(String encodedText) {
		Decoder decoder=Base64.getDecoder();
		byte[] decodedTxt=decoder.decode(encodedText);
		return new String(decodedTxt);
	}
	public static void main(String[] args) {
		String encode = SecurityUtils.encode("Guntuka Rakesh");
		System.out.println(encode);
		String decode=SecurityUtils.decode(encode);
		System.out.println(decode);
		
	}

}
