package com.test.annotation;

import com.test.config.AutowiredModeInjection;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AutowiredModeInjection.class)
public @interface EnableAutowiredMode {

	int value() default 1;
}
