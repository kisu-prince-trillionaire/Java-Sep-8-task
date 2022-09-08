package com.list.linked;

public class QueueNode {
	private int data;
	private QueueNode front;
	private QueueNode rear;
	
	public QueueNode() {
	}
	
	public QueueNode(int data, QueueNode front, QueueNode rear) {
		this.data = data;
		this.front = front;
		this.rear = rear;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public QueueNode getFront() {
		return front;
	}
	public void setFront(QueueNode front) {
		this.front = front;
	}
	public QueueNode getRear() {
		return rear;
	}
	public void setRear(QueueNode rear) {
		this.rear = rear;
	}
	
	public static QueueNode getQueueNode(int data) {
		QueueNode node = new QueueNode();
		node.data = data;
		node.front = null;
		node.rear = null;
		return node;
	}

}
