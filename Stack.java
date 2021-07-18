package com.bridgelabz.stackandqueue;

public class Stack<T extends Object> {
	int capacity;
	T[] array;
	int top;

	public Stack(int size) {
		array = (T[]) new Object[size];
		this.capacity = size;
		this.top = -1;
	}

	public void push(T element) {

		if (isFull()) {
			System.out.println("Stack is full and can't insert new Element");
			System.exit(1);
		}

		array[++top] = element;
		System.out.println("Inserting " + element + " to the Stack ");
	}
	
	public boolean isFull() {

		return top == capacity - 1;
	}
}
