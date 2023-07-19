package aop.java;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service // 객체를 생성하는게 아닌 비지니스 로직을 수행한다
@Aspect
public class Action {
	
	@Before("execution(* work())")
	public void gotoOffice() {
		System.out.println("출근을 합니다...");
	}
	
	@After("execution(* work())")
	public void getoffOffice() {
		System.out.println("퇴근을 합니다");
	}

}
