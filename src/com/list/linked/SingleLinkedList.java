package com.list.linked;

import java.util.Scanner;

public class SingleLinkedList {
	private Node head;
	private Node last;
	public SingleLinkedList() {
		head = null;
		last = null;
	}
	public void createSll() {
		String choice = null;
		Scanner sc = new Scanner(System.in);
		do {
		    System.out.println("Enter the data : ");
		    int data = sc.nextInt();
		
		    Node node = Node.getNode(data);
		    if(head == null) {
			    head = null;
			    last = null;
		    }
		    else {
			    last.setNext(node);
			    last = node;
		    }
		    System.out.println("Do you want to add new node yes/no : ");
		    choice = sc.next();
		  }while(choice.equalsIgnoreCase("yes"));
	}
	
	public void displaySll() {
		if(head == null) {
			System.out.println("SLL is Empty!");
		}else {
			Node ref = head;
			System.out.println("Content of SLL : ");
			while(ref != null) {
				System.out.println(ref.getData());
				ref = ref.getNext();
			}
		}
	}
}
