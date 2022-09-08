package com.list.linked;

public class Node {
	private int data;
	private Node next;
	private Node prev;
	
	public Node() {
		
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.next = prev;
	}
	
	public static Node getNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}
}
