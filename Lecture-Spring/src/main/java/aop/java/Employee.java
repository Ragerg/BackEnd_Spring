package aop.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface Employee {
	
	@Autowired
	public void work();

}
