package com.test.interfaces.initializingBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class TestInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean/afterPropertiesSet");
	}
}
