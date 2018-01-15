package com.ctci.arrayandstring;

import java.util.Scanner;

/*
Algorithm to determine if String has all unique characters
*/
public class IsUnique {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		
		boolean isUnique = checkForUniqueCharacter(input);
		System.out.println("The input string : " + input + " is unique : " + isUnique);
		
		
	}

	private static boolean checkForUniqueCharacter(String input) {

		boolean[] charFlag = new boolean[256]; // Take a character flag for all 256 ASCII values
		
		if (charFlag.length > 256){
			
			return false; // if string length is greater than 256 means the character is repeating
		}
		
		for (int chrAscii : input.toCharArray()){
			
			if (charFlag[chrAscii]){
				
				return false; // Character for this ASCII value is repeating.
			}else {
				
				charFlag[chrAscii] = true; // set the character flag for that ASCII value as true, which indicates that character has occured.
			}
		}
		
		return true;
		
	}

}
