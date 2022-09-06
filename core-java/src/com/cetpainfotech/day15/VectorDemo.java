package com.cetpainfotech.day15;

import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(20);
		stack.add(22);
		stack.add(10);
		stack.add(20);
		stack.push(34);
		
		System.out.println(stack);

	}

}
