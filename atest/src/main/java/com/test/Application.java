package com.test;

import com.test.config.AppConfig;
import com.test.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
//		context.addBeanFactoryPostProcessor();
//		context.getBeanFactoryPostProcessors()
		context.register(AppConfig.class);
		context.refresh();
//		context.getBean(TestService.class).test();
	}
}
