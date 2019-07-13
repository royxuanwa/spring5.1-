package com.test.service;

import com.test.annotation.EnableSetter;
import org.springframework.stereotype.Service;

@Service
@EnableSetter
public class TestService {


	public TestService() {
	}

	public void test(){
		System.out.println("service test");
	}
}
