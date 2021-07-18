package com.bridgelabz.stackandqueue;

public class Queue <T extends Object>{
	int capacity;
	T[] array;
	int front;
	int rear;
	int size = 0;

	public Queue(int capacity) {
		this.capacity = capacity;
		front = 0;
		rear = -1;
		array =(T[]) new Object[capacity];
	}

	// method to insert the element in the queue
	public void enqueue(T element) {
		if (isFull()) {
			System.out.println("Queue is full, so no elements is accepting.");
		} else {
			System.out.println("Size of the element is: " + size);
			rear++;
			System.out.println("rear "+rear);
			array[rear] = element;
			size++;

			System.out.println("Element inserted in queue:" + element);
		}
	}
	
	public boolean isFull() {
		if (size == capacity) {
			return true;
		}
		return false;
	}
}
