package com.bridgelabz.stackandqueue;

public class QueueImplementation {

	public static void main(String[] args) {
		Queue<Integer> intQueue = new Queue<>(5);
		intQueue.enqueue(56);
		intQueue.enqueue(30);
		intQueue.enqueue(70);
		
		intQueue.dequeue();
	}

}
