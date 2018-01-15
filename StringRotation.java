package com.ctci.arrayandstring;

import java.util.Scanner;

/*
   S2 is a rotation of S1
*/
public class StringRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string S1 : ");
		String S1 = sc.nextLine();
		
		System.out.println("Enter the second String S2 : ");
		String S2 = sc.nextLine();

		boolean isRotation = checkForStringRotation(S1, S2);
		
		System.out.println("Is S2 rotation of S1 : " + isRotation);
		
	}

	private static boolean checkForStringRotation(String s1, String s2) {

		String s1s1 = s1 + s1;
		
		/*if (s1s1.contains(s2)){
			
			return true;
		}*/
		
		if(isSubstring(s1s1, s2)){ // In case of String rotation, s1s1 (two repeatation of s1) must contain s2.
			
			return true;
		}
		
		
		return false;
	}

	private static boolean isSubstring(String s1s1, String s2) {
		
		if (s1s1.indexOf(s2) >=0 ){
			
			
			return true;
		}
		
		return false;
	}

}
