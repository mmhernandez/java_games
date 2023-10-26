package com.mmhernandez.games.services;

import org.springframework.stereotype.Service;

import com.mmhernandez.games.models.ColorText;

@Service
public class ColorTextService {
	
	public ColorText getNewColorText() {
		ColorText newColorText = new ColorText();
		return newColorText;
	}
	
}
