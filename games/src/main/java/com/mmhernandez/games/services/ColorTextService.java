package com.mmhernandez.games.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmhernandez.games.models.ColorText;

@Service
public class ColorTextService {

	@Autowired
	ColorText colorText;
	
	ColorText getNewColorText() {
		ColorText newColorText = new ColorText();
		
		
		return newColorText;
	}
	
}
