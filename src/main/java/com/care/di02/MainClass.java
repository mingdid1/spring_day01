package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// classpath : resources ������ �����ϴ� ����
		// src/main/resources/applicationST.xml
		String path= "classpath:applicationST.xml";
		
		// path�� ������ �����ϰ� �ش� bean���� ioc�����̳ʿ� ����Ѵ�
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		// stb�����ðŰ� �ش� �ڷ����� STBean�̴�
		STBean stb = ctx.getBean("stb", STBean.class);
		
//		stb.setName("ȫ�浿2");
//		stb.setAge(30);
		
		stb.namePrint();
		stb.agePrint();
	}
}
