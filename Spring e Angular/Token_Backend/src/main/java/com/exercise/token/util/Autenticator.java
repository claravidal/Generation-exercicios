package com.exercise.token.util;

import javax.xml.bind.DatatypeConverter;
import com.exercise.token.model.User;


public class Autenticator {
	
	private static final String prefix = "GeNeRaTiOn|";
	
	public static String encode(User user) {
		return DatatypeConverter.printHexBinary((prefix+user).getBytes());
	}
		
		public static boolean isValid(String token) {
			byte strByte[] = DatatypeConverter.parseHexBinary(token);
			String newToken = new String(strByte);
			return newToken.startsWith(prefix);	
		}
		
	}

