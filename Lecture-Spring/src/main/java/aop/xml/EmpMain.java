package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * SPRING AOP 특징
 * 1. RUNTIME 기반
 * 2. PRROXY 기반
 * 3. INTERFACE 기반
 */
public class EmpMain {
	
	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		
		// 인터페이스 기반으로
		Employee programmer = context.getBean("programmer", Employee.class);
		programmer.work();
		
		Employee designer = context.getBean("designer", Employee.class);
		designer.work();
	}

}
