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
		
		MyNode<Integer> myFirstNode1 = new MyNode<>(56);
		MyNode<Integer> mySecondNode1 = new MyNode<>(30);
		MyNode<Integer> myThirdNode1 = new MyNode<>(70);
		
		MyLinkedList myLinkedLIst1 = new MyLinkedList();
		myLinkedLIst.add(myFirstNode1);
		myLinkedLIst.append(mySecondNode1);
		myLinkedLIst.append(myThirdNode1);
	}
}
