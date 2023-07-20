package kr.co.mlec.body;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/ajax")
@Controller
public class ResBodyController {
	
	@RequestMapping("/resBody.do")
	@ResponseBody
	public String resStringBody() {
		return "OK, 성공";
	}
	
	@RequestMapping("/resBody.json")
	@ResponseBody
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "sbc");
		result.put("name", "hong");
		result.put("addr", "서울");
		return result;
	}

}
