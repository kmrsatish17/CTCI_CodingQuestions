package com.ctci.stack.queue;

import java.util.NoSuchElementException;

public class MyQueueImpl<T> {

	// Creating a Queue Node class
	private class QueueNode<T> {

		private T nodeData;
		private QueueNode<T> next;

		public QueueNode(T data) {

			this.nodeData = data;
		}

	}

	public MyQueueImpl() {

		firstNode = null;
		lastNode = null;
		size = 0;
	}

	QueueNode<T> firstNode;
	QueueNode<T> lastNode;

	int size;

	public void add(T data) {

		QueueNode<T> newNode = new QueueNode(data); // Create a new Node

		if (lastNode != null) {
			lastNode.next = newNode; // assign new node after the last node
		}

		lastNode = newNode; // 1. Now new node become the last node. 2. if lastNode was null then add new node to the last node

		if (firstNode == null) {
			firstNode = lastNode; // If first node is null then the new last node become the first node.
		}

		size++;
	}

	public T remove() {

		if (firstNode == null)
			throw new NoSuchElementException();

		T removData = firstNode.nodeData; // Get the data from the first node
		firstNode = firstNode.next; // To remove the first node, assign the first node's next element to the first node.

		if (firstNode == null) {

			lastNode = null; // If nothing at first node then nothing will be at last node as well.
		}

		size--;

		return removData;

	}

	public T peek() {
		if (firstNode == null)
			throw new NoSuchElementException();

		return firstNode.nodeData; // return the first node data without removing it.
	}

	public boolean isEmpty() {

		return (firstNode == null); // if firt node is null then queue becomes empty.
	}

	public static void main(String[] args) {

		MyQueueImpl<Integer> myQueue = new MyQueueImpl<>();

		System.out.println("Size of queue : " + myQueue.size);
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		System.out.println("Size of queue : " + myQueue.size);

		Integer rmvData = myQueue.remove();
		System.out.println("Removed Data : " + rmvData);

		Integer peekData = myQueue.peek();
		System.out.println("Peeked Data : " + peekData);

		System.out.println("Is queue empty : " + myQueue.isEmpty());

		while (myQueue.firstNode != null) {

			System.out.println("Removed data " + myQueue.remove());
		}

		System.out.println("Is queue empty : " + myQueue.isEmpty());

	}

}
