package my.com.model.BeanPostProcesModels;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessorSample implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName)	throws BeansException {
		System.out.println("postProcess-Before-Initialization");
		if (bean instanceof Person){
			((Person) bean).setVillage("India");
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcess-After-Initialization");
		if (bean instanceof Person && ((Person) bean).getName().equals("Mr. Tapan")){
			((Person) bean).setVillage("USA");
		}
		return bean;
	}

}
