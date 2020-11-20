package com.langme.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		System.out.println("haha");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

		// Spring源码解析 -- 读取bean元数据
		BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));

	}
}
