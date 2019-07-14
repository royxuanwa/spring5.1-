package com.test.config;

import com.test.annotation.EnableAutowiredMode;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;


public class AutowiredModeInjection implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition db = (GenericBeanDefinition) beanFactory.getBeanDefinition("");
//		String[] names = beanFactory.getBeanDefinitionNames();
	}

//	@Override
//	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		AnnotationAttributes mapperScanAttrs = AnnotationAttributes
//				.fromMap(importingClassMetadata.getAnnotationAttributes(EnableAutowiredMode.class.getName()));
//	}
}
