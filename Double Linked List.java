
class Node {
	Object value;
	Node next;
	Node previous;
	
	public Node(Object value,Node next,Node previous) {
		this.next=next;
		this.previous=previous;
		this.value=value;
	}

}

class DoubleLinkedList {
	Node headNode;
	
	
	public DoubleLinkedList() {
		headNode=null;
	}
	
	public void addBeg(Object value) {
		Node newNode=new Node(value, null, null);
		
		if (headNode==null) {
			headNode=newNode;
		}else {
			newNode.next=headNode;
			headNode.previous=newNode;
			headNode=newNode;
		}
	}
	public void addEnd(Object value) {
		Node n=headNode;
		Node newNode=new Node(value, null, null);
		while (n!=null) {
			if (n.next==null) {
				n.next=newNode;
				newNode.previous=n;
				break;
			}
			n=n.next;
		}
		
		
		
	}
	public void addAtPos(Object value,int pos) {
		Node n=headNode;
		Node temp;
		Node newNode=new Node(value,null,null);
		int c=0;
			
		if (pos==1) {
			addBeg(value);
		}else {
			while (n!=null) {
				
				if(c==pos-2) {
					temp=n.next;
					n.next=newNode;
					newNode.previous=n;
					newNode.next=temp;
					break;
				}
				c++;
				n=n.next;
			}
		}
		
		
		
	}
	public void deleteFromFirst() {
		
		headNode=headNode.next;
		headNode.previous=null;
	}
	public void deleteFromLast() {
		Node n=headNode;
		while (n!=null) {
			if(n.next.next==null) {
				n.next.previous=null;
				n.next=null;
				
				break;
			}
			n=n.next;
		}
	}
	public void deleteAtPos(int pos) {
		Node n=headNode;
		int c=0;
			
		if (pos==1) {
			deleteFromFirst();
		}else if(pos==length()) {
			deleteFromLast();
		}else {
			while(n!=null) {
				if(c==pos-2) {
					n.next=n.next.next;
					n.next.next.previous=n;
					break;
				}
				c++;
				n=n.next;
			}
		}
		
		
	}
	public int length() {
		Node n=headNode;
		int c=0;
		while (n!=null) {
			c++;
			n=n.next;
		}
		return c;
	}
	public void display() {
		Node n=headNode;
		
		while (n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
	public void displayReversed() {
		Node n=headNode;
		while (n!=null) {
			if (n.next==null) {
				break;
			}
			n=n.next;
		}
		while (n!=null) {
			System.out.println(n.value);
			n=n.previous;
		}
	}

}

public class App {

	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList();
		list.addBeg(1);
		list.addBeg(2);
		list.addBeg(3);
		list.addEnd(12);
		list.display();
		System.out.println("---------------------------------");
		list.displayReversed();
		
		
	}

}

/*
OUTPUT:
3
2
1
12
---------------------------------
12
1
2
3

*/


