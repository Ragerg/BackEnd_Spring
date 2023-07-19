package aop.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // @Aspect 사용할 수 있게
@ComponentScan(basePackages = {"aop.java"})
@Configuration
public class Config {

}
