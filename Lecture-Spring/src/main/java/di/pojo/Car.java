package di.pojo;

public class Car {
	
	private Tire tire;
	
	public Car() {
		// car Ŭ������ �ѱ�Ÿ�̾�Ŭ������ �������� ������ ����
//		tire = new HankookTire();
//		tire = new KumhoTire();
	}
	
	public Car(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("������ Ÿ�̾� : " + tire.getBrand());
	}

}
