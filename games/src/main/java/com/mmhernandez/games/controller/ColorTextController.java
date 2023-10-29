package com.mmhernandez.games.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mmhernandez.games.models.ColorText;
import com.mmhernandez.games.services.ColorTextService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ColorTextController {
	
	@Autowired
	ColorTextService colorTextService;
	
	@GetMapping("/colortext")
	public String startGame(Model model) {
		String instructions = "Test";
		model.addAttribute("instructions",instructions);
		
		return "colorText.jsp";
	}

	@GetMapping("/play") 
	public String playGame(HttpSession session,
			Model model) {
		if(session.getAttribute("gameSet") == null) {
			ArrayList<ColorText> gameSet = new ArrayList<ColorText>();
			
			for(int i=0; i<10; i++) {
				gameSet.add(colorTextService.getNewColorText());
			}
			session.setAttribute("gameSet", gameSet);
		}
		
		Random rand = new Random();
		int randInt = rand.nextInt(10);
		String order = "right";
		if (randInt % 2 == 0) {
			model.addAttribute("order", order);
		}
		else {
			order = "left";
			model.addAttribute("order", order);
		}

		return "colorText.jsp";
	}
	
	@GetMapping("/cancel")
	public String cancelGame(HttpSession session) {
		session.invalidate();
		return "redirect:/colortext";
	}
	
}
