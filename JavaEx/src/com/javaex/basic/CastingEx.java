package com.javaex.basic;

// 데이터 타입을 다른 데이터 타입으로 변경 (Casting)
// 1. 좁은 표현 범위 데이터 -> 넓은 표현 범위 데이터(Promotion)
// 2. 넓은 표현 범위 데이터 -> 좁은 표현 범위 데이터 (Casting)
public class CastingEx {

	// 자료형의 크기
	// byte(1) < short(2) < int(4) < long(8) 
	//    << float(4) < double(8)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//promotionEx();
		castingEx();
	}
	
	public static void promotionEx() {
		// implicit castion(암묵적 변환)
		// 표현 범위가 좁은 타입 -> 넓은 타입으로의 변환
		byte b = 25; // 1바이트 정수형
		System.out.println("바이트: "+ b);
		
		short s = b; // 2바이트 정수형 // 큰걸로 옮기므로 문제가 없다. 
		System.out.println("short: "+ s);
		
		int i = s; // 4바이트 정수형
		System.out.println("int: "+ i);
		
		long l = i; // 8바이트 정수형
		System.out.println("long: "+ l);
		// 정수 promption에서는 특별한 변환과정이 필요없다.
		
		float f = l; // 4바이트 실수형
		// 바이트 수는 적지만 표현 범위가 float > long
		System.out.println("flat: "+ f);
		
		double d = f; 
		System.out.println("double: "+ d);
	}
	
	public static void castingEx() {
		// explicit casting(명시적 변환)
		// 표현 범위 넓은 타입 -> 좁은 타입으로의 변환
		// 자료의 유실 발생 가능
		// 개발자가 명시적으로 변환할 자료형을 지정
		float f = 1234.5678F;
		System.out.println("float: " + f);
		
		long l = (long)f;
		System.out.println("-> long: " + l);
		
		int i = (int)l;
		System.out.println("-> int: " + i);
		
		short s = (short)i;
		System.out.println("-> short: " + s);
		
		byte b = (byte) s;
		System.out.println("-> byte: " + b);
	}
}
