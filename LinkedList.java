import java.util.HashSet;
import java.util.Set;

public class LinkedList {

	/*
	 * Remove duplicates from unsorted linked list
	 * 
	 */
	
	class Node {
		Node next;
		int val;
	}
	
	Node head = null;
	Node tail = null;
	
	void addValue(int v){
		
		Node n = new Node();
		
		if(head == null){
			head = n;
		}
		
		if(tail != null){
			tail.next = n;
			tail = n;
		}else{
			tail = n;
			
		}
		n.next = null;
		n.val = v;
		
	}
	
	void removeDuplicate(int v){
		
		Set valueSet = new HashSet();
		
		Node node = head;
		Node prevNode = node;
		while(node.next!=null){
			
			if(valueSet.contains(node.val)){
			
				prevNode.next = node.next;
					
			}else{
				valueSet.add(node.val);
				prevNode = node;
			}
			
			node = node.next;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
}
