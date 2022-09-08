package com.list.linked;

import java.util.Scanner;

public class StackUsingLinkedList {
	private StackNode head;

	public StackUsingLinkedList() {
		this.head = null;
	}

	public StackNode getHead() {
		return head;
	}

	public void setHead(StackNode head) {
		this.head = head;
	}

	public void createStack() {
		String choice = null;
		Scanner sc = new Scanner(System.in);
		do {
		    System.out.println("Enter the data : ");
		    int data = sc.nextInt();
		
		    StackNode node = StackNode.getStackNode(data);
		    if(head == null) {
			    head = null;
		    }
		    
		    	node.setData(data);
		    	node.setNext(head);
		        head = node;
		        System.out.println("Pushed Successfully");
		    
		    System.out.println("Do you want to add new node yes/no : ");
		    choice = sc.next();
		  }while(choice.equalsIgnoreCase("yes"));
	}
	public void displayStack() {
		if(head == null) {
			System.out.println("Stack is Empty!");
		}else {
			StackNode ref = head;
			System.out.println("Content of Stack : ");
			while(ref != null) {
				System.out.println(ref.getData());
				ref = ref.getNext();
			}
		}
	}

	public void pop() { 
//		int data;
		StackNode node = new StackNode();
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        node.setNext(head);
//        head = node;
    }
	
	
}
