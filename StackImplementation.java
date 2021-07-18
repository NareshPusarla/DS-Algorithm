package com.bridgelabz.stackandqueue;

public class StackImplementation {

	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<Integer>(3);
		intStack.push(70);
		intStack.push(30);
		intStack.push(56);
		
		System.out.println("peek value is "+intStack.peek());
		
		intStack.pop();
		intStack.pop();
		intStack.pop();
		
		System.out.println("Peek value is "+ intStack.peek());
	}

}
