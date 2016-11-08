package my.com.controller;

import my.com.model.BeanPostProcesModels.Company;
import my.com.model.BeanPostProcesModels.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringApplication-context.xml");
		Company company =   (Company) applicationContext.getBean("company");
		
		Person ownar1 = company.getOwnar1();
		System.out.println("Ownar 1 name = "+ownar1.getName() + " And Village = "+ownar1.getVillage());
	}
}
