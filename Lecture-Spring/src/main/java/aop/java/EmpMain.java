package aop.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * SPRING AOP Ư¡
 * 1. RUNTIME ���
 * 2. PRROXY ���
 * 3. INTERFACE ���
 */
public class EmpMain {
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Employee programmer = context.getBean("programmer", Employee.class);
		programmer.work();
		
		Employee designer = context.getBean("designer", Employee.class);
		designer.work();
	}

}