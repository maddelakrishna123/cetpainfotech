package com.cetpainfotech.day3.dicegame;

public class Dice {
	private int faceValue;

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public Dice() {
		
	}
	
	
	public void roll()
	{
		faceValue = ((int)Math.random()*10)%6+1;
	}
	

}
