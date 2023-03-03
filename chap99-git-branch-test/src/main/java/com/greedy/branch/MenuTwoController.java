package com.greedy.branch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuTwoController {

	@GetMappingMapping("/menu2")
	public String defaultLocation() {
		
		return "main";
	}
	
	@RequestMapping("/main")
	public void main() {}
	
}

	

