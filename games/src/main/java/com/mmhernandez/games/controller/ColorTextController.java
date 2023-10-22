package com.mmhernandez.games.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColorTextController {
	
	@GetMapping("/colortext")
	public String startGame(Model model) {
		String instructions = "Test";
		model.addAttribute(instructions);
		
		return "colorText.jsp";
	}

}
