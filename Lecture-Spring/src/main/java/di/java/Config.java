package di.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {
	
	/* -> ��� @ComponentScan(basePackages = {"di.java"})
	@Bean
	public Car car() {
		return new Car();
	}

	@Bean
	@Qualifier("hankook") // �̸� �Ӽ� �ٲٱ� 2
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Bean(name="kumho")  // �̸� �Ӽ� �ٲٱ� 1
	public Tire kumhoTire() {
		return new KumhoTire();
	}
	*/
}
