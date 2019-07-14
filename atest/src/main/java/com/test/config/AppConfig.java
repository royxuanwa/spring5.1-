package com.test.config;


import com.test.annotation.EnableAutowiredMode;
import com.test.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.test")
//@EnableAspectJAutoProxy
public class AppConfig {

//	@Bean
//	public TestService TestService() {
//		return new TestService();
//	}
}
