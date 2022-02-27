package com.Cricket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IPL {
@RequestMapping("/RCB")
	@ResponseBody
	public String Score() {
	return "RCB Score-201/1, Over-19.2";
	
}
}
