package di.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		
		// ��ü�� �̱���
//		ApplicationContext context =  new GenericXmlApplicationContext("di-anno.xml");
		ApplicationContext context =  new GenericXmlApplicationContext("di-anno2.xml");
		
		// xml���� ������ ��ü�� id�� car�� ��ü �������� getBean("id�̸�",��ȯŬ����.class)
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
	}
	

}
