package com.atmpin.Util;

import java.util.Scanner;

public class KeyboardUtil {

	public static int getInt(String message) {
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}

}
