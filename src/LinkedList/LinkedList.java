package LinkedList;

public class LinkedList {
	Node head = null;

	public static void main(String[] args) {

	}

	public String search(String s) {
		Node n = head;
		while (n != null) {
			if(s == null && (n.getData() == null)) {
				return "Null";
			}
			n = n.next;
		}
		return "not Found";

	}

	public Node getHead() {
		return head;
	}

	public void traverse() {
		Node n = head;
		while (n != null) {
			System.out.println(n.getData());
			n = n.next;
		}
	}
	
	public void insert(Node newNode){
		if(newNode == null){
			newNode = new Node();
			
		}
		if (head == null){
			head = newNode;
		}else {  newNode.next = head;
		 	head=newNode;
		
		}
	}
	public void insertAfter(Node current, Node newNode){
		newNode.next = current.next;
		current.next = newNode;
	}
	public boolean delete(Node nodeToDelete){
		Node n = head;
		while (n != null){
			n = n.next;
			if(n == nodeToDelete){
				n.next = nodeToDelete.next;
				return true;
			}

			
		}
		return false;
	}
}
