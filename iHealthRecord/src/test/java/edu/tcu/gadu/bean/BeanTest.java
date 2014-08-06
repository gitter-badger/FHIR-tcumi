package edu.tcu.gadu.bean;

import org.hl7.fhir.instance.model.element.resuorce.FamilyHistory;
import org.hl7.fhir.instance.model.element.resuorce.Patient;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import edu.tcu.gaduo.springmvc.service.GenericServiceImpl;

public class BeanTest {

//	@Test
	public void test() {
		System.setProperty("spring.profiles.active", "mongodb");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring\\business-config.xml");
		ctx.refresh();
		MongoTemplate mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
		if(!mongoTemplate.collectionExists(Patient.class)){
			mongoTemplate.createCollection(Patient.class);	
		}
				
	}
	
	@Test
	public void test02(){
		System.setProperty("spring.profiles.active", "mongodb");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load( 
        		"spring\\mvc-core-config.xml", 
        		"spring\\tools-config.xml",
        		"spring\\business-config.xml",
        		"spring\\mvc-view-config.xml");
		ctx.refresh();
		
		String[] names = ctx.getBeanDefinitionNames();
		for(String name : names){
			System.out.println(name);
		}
//		GenericServiceImpl<FamilyHistory> service = (GenericServiceImpl<FamilyHistory>) ctx.getBean("_GenericServiceImp");
//		service.save(new FamilyHistory());
	}

}
