package com.qa.operators;

public class operators {

	public static void main(String[] args) {
		int int1 = 45;
		int int2 = 2;
		
		double dub1 = 45;
		double dub2 = 2;
		
		System.out.println(int1 + int2);
		operators.multi(int1, int2);
		operators.sub(int1, int2);
		operators.division(int1, int2);
		operators.division1(dub1, dub2);
	}

	public static void multi(int int1, int int2) {
		System.out.println(int1 * int2);
	}
	
	public static void sub(int int1, int int2) {
		System.out.println(int1 - int2);
	}
	public static void division(int int1, int int2) {
		System.out.println(int1 / int2);
	}
	public static void division1(double dub1, double dub2) {
	System.out.println(dub1 / dub2);
	}
	
	
	
	
	
	
	
}
