package di.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {
	
	/* -> 대신 @ComponentScan(basePackages = {"di.java"})
	@Bean
	public Car car() {
		return new Car();
	}

	@Bean
	@Qualifier("hankook") // 이름 속성 바꾸기 2
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Bean(name="kumho")  // 이름 속성 바꾸기 1
	public Tire kumhoTire() {
		return new KumhoTire();
	}
	*/
}
