
class Node {
	
	Object value;
	Node next;
	
	public Node(Object value,Node next) {
		this.next=next;
		this.value=value;
		
	}
	
	//Node yapısını oluşturdugumuz class
	
	

}
class LinkedList<T> {
	
	
	
	
	
	Node headNode;
	
	
	public LinkedList() {
		headNode=null;
		
	}
	
	public void addBegg(Object value) {
		Node newNode=new Node(value, null);
		if (headNode==null) {
			
			headNode=newNode;
		}else {
			newNode.next=headNode;
			headNode=newNode;
		}
		
	}
	public void addEnd(Object value) {
		Node newNode=new Node(value, null);
		if (headNode==null) {
			headNode=newNode;
		}else {
			Node n=headNode;
			while (n!=null) {
				if (n.next==null) {
					n.next=newNode;
					break;
				}
				n=n.next;
			}
			
		}
	}
	public void addAtPos(Object value,int pos) {
		Node newNode=new Node(value, null);
		Node n=headNode;
		Node temp;
		int c=0;
		if (pos==1) {
			addBegg(value);
		}else if(pos+1==length()){
			addEnd(value);
		}else {
			while (n!=null) {
				if(c==pos-2) {
					temp=n.next;
					n.next=newNode;
					newNode.next=temp;
					break;
				}
				n=n.next;
				c++;
			}
		}
	}
	public int length() {
		int c=0;
		Node n=headNode;
		
		while (n!=null) {
			System.out.println(n.value);
			c++;
			n=n.next;
			
		}
		
		return c;
		
	}
	public void deleteFromFirst() {
		headNode=headNode.next;
	}
	public void display() {
		Node n=headNode;
		
		while (n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public class App {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.addBegg(1);
		list.addBegg(2);
		list.addBegg(3);
		list.addBegg(4);
		list.addBegg(5);
		list.addEnd(12);
		
		list.display();
		
	}

}

//OUTPUT:
/*
5
4
3
2
1
12
*/


