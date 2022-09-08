package com.list.linked;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList obj = new StackUsingLinkedList();
		obj.createStack();
		obj.displayStack();

//		System.out.println("The Popped data is : " + obj.pop());
		obj.pop();
		obj.displayStack();
	}

}
