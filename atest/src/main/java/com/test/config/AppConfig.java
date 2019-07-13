package com.test.config;


import com.test.annotation.EnableAutowiredMode;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.test")
@EnableAspectJAutoProxy
@EnableAutowiredMode
public class AppConfig {

//	@Bean
//	public TestService TestService() {
//		return new TestService();
//	}
}
