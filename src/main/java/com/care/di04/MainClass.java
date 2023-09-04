package com.care.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path="classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// Car를 상속받아서 사용하기 때문에 controller01,02 바꿀때 
		// 자료형을 Car로 통일해서 사용가능, xml파일에 bean->class 부분만 변경해주면 됨
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("main 실행");
		car.speed();
		System.out.println("---------------------");
		
		SubClass sc = new SubClass();
		sc.print();
		
		
	}
}
