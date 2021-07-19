package com.bridgelabz.linkedlist;

public class MyLinkedListTest {
	public void addedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList myLinkedLIst = new MyLinkedList();
		myLinkedLIst.add(myFirstNode);
		myLinkedLIst.add(mySecondNode);
		myLinkedLIst.add(myThirdNode);
		
		myLinkedLIst.printMyNode();
	}
}
