package my.com.controller;

import my.com.model.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrowingCtlr {

	public static void main(String[] args) {
	//	AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication-context.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication-context.xml");
		Shape shape =  (Shape) context.getBean("triangle");
		//context.registerShutdownHook();
		shape.draw();
	}

}
