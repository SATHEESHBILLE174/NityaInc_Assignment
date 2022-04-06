package com.basics;

public class Test {
	protected void food() {

	}
	public static String m1() {
		try {
			return "try";
		}
		catch(Exception e) {
			return "catch";
			
		}
		
	}
	
	public static int reverseAnGivenNumber(int num) {
		int reverseNumber=0;
		while(num!=0) {
			int remainder=num%10;
			reverseNumber=reverseNumber*10+remainder;
			num=num/10;
		}
		
		return reverseNumber;
		
	}
	

	public static void main(String[] args) {
		System.out.println(reverseAnGivenNumber(12345));
		String s=null;
		System.out.println();
	}
}