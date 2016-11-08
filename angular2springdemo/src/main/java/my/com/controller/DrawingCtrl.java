package my.com.controller;

import my.com.model.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingCtrl {

	public static void main(String[] args) {
	//	AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication-context.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication-context.xml");
		Shape shape1 =  (Shape) context.getBean("circle");
		Shape shape2 =  (Shape) context.getBean("triangle");
		//context.registerShutdownHook();
		shape1.draw();
		shape2.draw();
	}
}
