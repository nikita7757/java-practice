package com.acc.string;

import java.util.Scanner;

public class PalindromeString1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a valid string");
		String str1 = sc.next();
		
		StringBuffer sb = new StringBuffer(str1);
		System.out.println("str1= "+str1);
		
		StringBuffer str2 = sb.reverse();
		System.out.println("str2= "+str2);
		
		if(str1.equals(sb.toString())) {
			System.out.println("the string is palindrome="+str1);
			
		}
		else {
			System.out.println("the string is not palindrome="+str1);
			
		}

	}

}
