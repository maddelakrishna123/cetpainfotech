package com.cetpainfotech.day3.dicegame;

public class DiceGame {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		Player p1 = new Player("Kumar");
		Player p2 = new Player("anudeep");
		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		
		
		if(p1.getValue() > p2.getValue())
		{
			System.out.println(p1.getName()+" Won the Grame with score "+p1.getValue());
		}
		else if(p1.getValue() == p2.getValue())
		{
			System.out.println("Scores are  equal");
		}
		else
		{
			System.out.println(p2.getName()+" Won the game with score "+p2.getValue());
			
		}

	}

}
