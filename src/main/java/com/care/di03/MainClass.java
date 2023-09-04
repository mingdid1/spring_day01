package com.care.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path="classpath:applicationDB.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// context를 통한 값 전달
		DBClass db = ctx.getBean("db", DBClass.class);
		System.out.println("id: "+ db.getId());
		System.out.println("pwd: "+ db.getPwd());

		// 생성자를 통한 값 전달
		DBClass db1 = ctx.getBean("db1", DBClass.class);
		System.out.println("id: "+ db1.getId());
		System.out.println("pwd: "+ db1.getPwd());
		
	}
}
