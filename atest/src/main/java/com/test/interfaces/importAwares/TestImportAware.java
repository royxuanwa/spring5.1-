package com.test.interfaces.importAwares;

import com.test.config.AppConfig;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Set;


public class TestImportAware implements ImportAware {
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("ImportAware/setImportMetadata");
		Set<String> a = importMetadata.getMetaAnnotationTypes(AppConfig.class.getName());
	}

}
