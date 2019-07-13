package com.test.config;

import com.test.annotation.EnableSetter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class AutowiredModeInjection implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] names = beanFactory.getBeanDefinitionNames();
	}

//	@Override
//	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		System.out.println("registerBeanDefinitions"+importingClassMetadata.getClassName());
//		Set<String> annotationTypes =  importingClassMetadata.getAnnotationTypes();
//		boolean hasEnableAutowireMode =  importingClassMetadata.hasAnnotation("com.test.annotation.EnableAutowireMode");
////		importingClassMetadata.getAnnotatedMethods()
////		importingClassMetadata.hasAnnotation(EnableSetter.class);
//	}
}
