package com.assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssignmentZeroController {
	@RequestMapping("/index")
	public String Index() {
		return "Index";
	}
}