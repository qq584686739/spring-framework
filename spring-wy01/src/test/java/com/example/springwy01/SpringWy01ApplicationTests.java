package com.example.springwy01;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class SpringWy01ApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AService bean = applicationContext.getBean(AService.class);
		bean.sayHello();
	}

}
