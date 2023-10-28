package com.mmhernandez.games.models;

import java.util.HashMap;
import java.util.Random;

public class ColorText {
	
	private String text;
	private String textColorCode;
	private String altcolorCode;
	
	
	
//	CONSTRUCTOR
	public ColorText() {
		HashMap<Integer, String> textColorList = new HashMap<Integer, String>();
		textColorList.put(0, "yellow");
		textColorList.put(1, "blue");
		textColorList.put(2, "red");
		textColorList.put(3, "black");
		textColorList.put(4, "purple");
		textColorList.put(5, "green");
		textColorList.put(6, "gray");
		textColorList.put(7, "brown");
		textColorList.put(8, "pink");
		textColorList.put(9, "orange");
		
		HashMap<String, String> textColorCodeList = new HashMap<String, String>();
		textColorCodeList.put("yellow", "#ebdc32");
		textColorCodeList.put("blue", "#3288bd");
		textColorCodeList.put("red", "#ea2210");
		textColorCodeList.put("black", "#2d2d2d");
		textColorCodeList.put("purple", "#9461d4");
		textColorCodeList.put("green", "#29a628");
		textColorCodeList.put("gray", "#b1b1b1");
		textColorCodeList.put("brown", "#9a5c04");
		textColorCodeList.put("pink", "#ef88b3");
		textColorCodeList.put("orange", "#ff8306");

		
		Random rand = new Random();
		
		int randInt = rand.nextInt(textColorList.size());
		this.text = textColorList.get(randInt);
		this.textColorCode = textColorCodeList.get(this.text);
		
		int randInt2 = rand.nextInt(textColorList.size());
		while (randInt == randInt2) {
			randInt2 = rand.nextInt(textColorList.size());
		}
		this.altcolorCode = textColorCodeList.get(textColorList.get(randInt2));
		
	}



//	GETTERS & SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextColorCode() {
		return textColorCode;
	}

	public void setTextColorCode(String textColorCode) {
		this.textColorCode = textColorCode;
	}
	
	public String getAltcolorCode() {
		return altcolorCode;
	}
	
	public void setAltcolorCode(String altcolorCode) {
		this.altcolorCode = altcolorCode;
	}
	

}
