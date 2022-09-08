package com.list.linked;

import java.util.Scanner;

public class DoubleLinkedList {
	private DllNode head;
	private DllNode last;
	public DoubleLinkedList() {
		head = null;
		last = null;
	}
	public void createDll() {
		String choice = null;
		Scanner sc = new Scanner(System.in);
		do {
		    System.out.println("Enter the data : ");
		    String data = sc.next();
		
		    DllNode node = DllNode.getDllNode(data);
		    if(head == null) {
			    head = node;
			    last = node;
		    }
		    else {
			    last.setNext(node);
			    node.setPrev(last);
			    last = node;
//			    last.setNext(node);
		    }
		    System.out.println("Do you want to add new node yes/no : ");
		    choice = sc.next();
		  }while(choice.equalsIgnoreCase("yes"));
	}
	public void displayDll() {
		if(head == null) {
			System.out.println("DLL is Empty!");
		}else {
			DllNode ref = head;
			System.out.println("Content of DLL : ");
			while(ref != null) {
				System.out.println(ref.getData());
				ref = ref.getNext();
			}
		}
	}

}
