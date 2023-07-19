package di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		
		// ��ü�� �̱���
		ApplicationContext context =  new GenericXmlApplicationContext("di-xml.xml");
		
		// xml���� ������ ��ü�� id�� car�� ��ü �������� getBean("id�̸�",��ȯŬ����.class)
		Car car = context.getBean("car", Car.class);
//		Tire tire = context.getBean("hankook", Tire.class);
//		car.setTire(tire);
		car.printTireBrand();
		
		/*
		 Tire tire = new KankookTire();
		 Car c = new Car();
		 c.setTire(tire);
		 */
	}
	

}
