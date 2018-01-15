package com.ctci.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

	public ListNode removeDuplicate(ListNode head) {

		if (head == null || head.next == null) { // if head is null then linked list will be empty

			return head;
		}

		ListNode current = head;
		ListNode previous = null;

		Set<Integer> nodeSet = new HashSet<>();

		while (current != null) { // until reach till end of the node.

			if (nodeSet.contains(current.nodeData)) { // If duplicate found

				previous.next = current.next; // remove the current node
			} else {

				nodeSet.add(current.nodeData); // Add first LinkedList data into set and move one element forward
				previous = current;

			}

			current = current.next; // In both case, move one node forward

		}

		return head;
	}

	public static void main(String[] args) {

	}

}

class ListNode {

	int nodeData;
	ListNode next;

	public ListNode(int nodeData) {

		this.nodeData = nodeData;
	}

}