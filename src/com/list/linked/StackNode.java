package com.list.linked;

public class StackNode {
	private int data; 
    private StackNode next;
    
	public StackNode() {
	}
	public StackNode(int data, StackNode next) {
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	} 
    
	public static StackNode getStackNode(int data) {
		StackNode node = new StackNode();
		node.data = data;
		node.next = null;
		return node;
	}
}
