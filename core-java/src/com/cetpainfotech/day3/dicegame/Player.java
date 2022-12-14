package com.cetpainfotech.day3.dicegame;

public class Player {
	
	private String name;
	private int value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Player(String name)
	{
		this.name = name;
	}

	
	public void throwDice(Dice diceOne, Dice diceTwo)
	{
		diceOne.roll();
		diceTwo.roll();
		value = diceOne.getFaceValue() + diceTwo.getFaceValue();
	}
}
