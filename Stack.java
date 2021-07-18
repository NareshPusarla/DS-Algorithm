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
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty and there is no element to remove");
			System.exit(1);
		}
		System.out.println("removing the value : " + array[top]);
		return array[top--];
	}

	public T peek() {
		if (isEmpty()) {
			System.exit(1);
		} else {
			return array[top];
		}
		return null;
	}

	public boolean isFull() {

		return top == capacity - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}
