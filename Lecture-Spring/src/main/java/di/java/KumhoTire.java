package di.java;

import org.springframework.stereotype.Component;

@Component("kumho")
public class KumhoTire implements Tire {

	public String getBrand() {
		return "��ȣŸ�̾�";
	}
	
}