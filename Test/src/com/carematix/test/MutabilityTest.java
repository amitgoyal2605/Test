package com.carematix.test;

public class MutabilityTest {
	
	
	private int i;
	
	public static void main(String[] args) {
		String a = "hello world";
		String b = "hello world";
		String c = new String("hello world");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a == c);
		
		String s1 = "java";
		s1.concat(" rules");
		System.out.println("s1 refers to "+s1);  // Yes, s1 still refers to "java"
		
		String str = "knowledge";
		
		String s = str;
		str = str.concat(" base");
		
		System.out.println(s);
		System.out.println(str);
		
		MutabilityTest t = new MutabilityTest();
		
		t.i = 1;
		
		
	}

}
