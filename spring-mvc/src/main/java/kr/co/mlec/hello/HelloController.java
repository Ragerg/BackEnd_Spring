package kr.co.mlec.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 스프링 컨테이너가 관리하고 있다
public class HelloController {

	@RequestMapping("/hello/hello.do") // 요청 url 관리
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("msg","hi 스프링 MVC~~");
		return mav;
	}
	
}
