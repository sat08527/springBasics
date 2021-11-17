package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/spring.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		System.out.println("Document valid");
		bf.getBean("t");
		bf.getBean("t");
		bf.getBean("t");
		
		
	}
}
