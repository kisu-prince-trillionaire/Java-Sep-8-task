package com.list.linked;

public class DllNode {
	private String data;
	private DllNode next;
	private DllNode prev;
	
	public DllNode() {
	
	}
	
	public DllNode(String data, DllNode next, DllNode prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public DllNode getNext() {
		return next;
	}
	public void setNext(DllNode node) {
		this.next = node;
	}
	public DllNode getPrev() {
		return prev;
	}
	public void setPrev(DllNode prev) {
		this.prev = prev;
	}
	
	public static DllNode getDllNode(String data) {
		DllNode node = new DllNode();
		node.data = data;
		node.next = null;
		node.prev = null;
		return node;
	}

}
