package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		//consoleOutput();
		consoleInput();
	}
	
	// 콘솔 출력
	public static void consoleOutput() {
		// System.out.print -> 출력 후 개행 없음
		// System.out.println -> 출력 후 개행
		// System.out.printf -> 형식화된 출력 : String 할때 정리 (TODO)
		System.out.print("Hello ");
		System.out.println("Java");
		
		// 이스케이프 문자 (시퀸스)
		// \n : 개행
		// \t : 탭
		// \" : 쌍따옴표
		// \\ : \
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		String message = "Hello, \"Java\""; // 쌍따옴표
		
		// 파일을 다뤄야 한느데
		// C:\mydir\myfile.txt
		String dir = "C:\\mydir\\myfile.txt"; 
	}
	
	// 콘솔 입력
	// Scanner 클래스를 이용하면 다양한 입력 소스로부터 데이터를 입력 받을 수 있다. 
	public static void consoleInput();{
		// Tip 1. ctrl+shift+0-> 자동 import
		// Tip 2. ctrl+space -> Code Assist
		Scanner scanner = new Scanner(System.in);
		// 이름은? -> 문자열 데이터 입력
		// 나이는? 이라고 묻고 정수데이터 입력
		// 출력 -> 이름, 나이는 0세
		System.out.print("이름은? ");
		String name = scanner.next();
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		System.out.println("이름은 "+name+",나이는"+age);
		// 시스템 지
		
	}
}



















