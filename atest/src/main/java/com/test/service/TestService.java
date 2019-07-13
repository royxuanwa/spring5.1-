package com.test.service;


import com.test.interfaces.initializingBean.TestInitializingBean;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	public TestService(TestInitializingBean bean){

	}
	public void test(){
		System.out.println("service test");
	}
}
