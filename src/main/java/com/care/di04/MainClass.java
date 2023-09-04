package com.care.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path="classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// Car�� ��ӹ޾Ƽ� ����ϱ� ������ controller01,02 �ٲܶ� 
		// �ڷ����� Car�� �����ؼ� ��밡��, xml���Ͽ� bean->class �κи� �������ָ� ��
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("main ����");
		car.speed();
		System.out.println("---------------------");
		
		SubClass sc = new SubClass();
		sc.print();
		
		
	}
}
