package com.javaex.basic.reftyps;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();

	}
	public static void stringBasic() {
		// 가장 기본적인 참조자료형을 이해
		String str; 
		str = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		System.out.println(str == str2);
		System.out.println(str2 == str3);
	}
}
