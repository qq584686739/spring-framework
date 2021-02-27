package com.example.springwy01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xjh
 */
public class SpringWy01Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AService bean = applicationContext.getBean(AService.class);
		bean.sayHello();
	}


}
