package com.test.service;

import com.test.annotation.EnableSetter;
import com.test.service.interfaces.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TestService {
	@Autowired
	A a;

	public TestService() {
	}

	public void test(){
		System.out.println("service test");
	}
}
