package com.mmhernandez.games.models;

import java.util.Random;

public class ColorText {
	
	private String text;
	private String colorCode;
	
	
	
//	CONSTRUCTOR
	public ColorText() {
		String[] colorTextList = {
				"yellow",
				"blue",
				"red",
				"black",
				"purple",
				"green",
				"gray",
				"brown",
				"pink",
				"orange"
		};
		String[] colorCodeList = {
				"#ebdc32", // yellow
				"#3288bd", // blue
				"#ea2210", // red
				"#2d2d2d", // black
				"#9461d4", // purple
				"#29a628", // green
				"#b1b1b1", // gray
				"#9a5c04", // brown
				"#ef88b3", // pink
				"#ff8306"  // orange 
		};
		
		Random rand = new Random();
		this.text = colorTextList[rand.nextInt(colorTextList.length)];
		this.colorCode = colorCodeList[rand.nextInt(colorCodeList.length)];
	}

	
	
//	GETTERS & SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	

}
