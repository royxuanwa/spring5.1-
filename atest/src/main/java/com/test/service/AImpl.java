package com.test.service;

import com.test.service.interfaces.A;
import com.test.service.interfaces.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AImpl implements A {
	@Autowired
	B b;
}
