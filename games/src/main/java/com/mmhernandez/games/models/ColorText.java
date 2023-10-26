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
				"pink"
		};
		String[] colorCodeList = {
				"FFEF11", // yellow
				"1121FF", // blue
				"FF1111", // red
				"000000", // black
				"A049E2", // purple
				"009900", // green
				"A5A5A5", // gray
				"994C00", // brown
				"FF3399", // pink
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
