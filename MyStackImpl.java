package com.ctci.stack.queue;

import java.util.EmptyStackException;

public class MyStackImpl<T> {

	private static class StackNode<T> {

		private T nodeData;
		private StackNode<T> nextNode;

		public StackNode(T input) {

			this.nodeData = input;
		}

		@Override
		public String toString() {
			return "StackNode [nodeData=" + nodeData + ", nextNode=" + nextNode + "]";
		}
		
	}
	
	public MyStackImpl(){
		
		topNode = null;
	}
	
	private StackNode<T> topNode;
	int size = 0;
	
	public T pop(){
		
		if (topNode == null) throw new EmptyStackException();

		T topNodeData = topNode.nodeData;
		topNode = topNode.nextNode; // To Delete Top Node
		
		size--;
		return topNodeData;
	}
	
	public T peek(){
		
		if (topNode == null) throw new EmptyStackException();
		
        return topNode.nodeData; // returns the top node if its not null		
	}
	
	public void push (T dataItem){
		
		StackNode<T> newNode = new StackNode (dataItem); // Create New node
		newNode.nextNode = topNode; // assign new node's next node as top node. AS Top node will always remain top . 
		topNode = newNode; // assign new node as top node
		size++;
		
	}
	
	public boolean isEmpty(){
		
		return (topNode == null); // If top node is null then stack is empty
	}
	
	public static void main(String[] args) {
		
		MyStackImpl<Integer> myStack = new MyStackImpl<>();
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		
		System.out.println("size  : " + myStack.size);
		
		int poppedData = myStack.pop();
		
		System.out.println("poppedData : " + poppedData);
		System.out.println("size  : " + myStack.size);
		
		Integer peekNode = myStack.peek();
		
		System.out.println("peekNode : " + peekNode);
		
		System.out.println("is Empty Stack :" + myStack.isEmpty());
		
		while(!myStack.isEmpty()){
			
			
			System.out.println("Popped Data : " + myStack.pop());
		}
		
		System.out.println("is Empty Stack :" + myStack.isEmpty());

	}

}
