package com.javaex.oop.goods.v1;

// v1
// goods 객체를 생성하여 사용하는 클라스
public class GoodApp {
	
	public static void main(String[] args) {
		// Goods 클래스 사용
		Goods notebook = new Goods(); // 인스턴스화
		// 필드에 접근
		// name, price 필드는 private이므로 접근불가(은닉)
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d윈%n", 
				notebook.name, notebook.price);
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		System.out.printf("%s, %d원%n",
				smartphone.name, smartphone.price);
	}

}
