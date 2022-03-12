
public class StackImp<T> {
	
	
	private int maxSize;
	private Object stackArray[];
	private int top;
	
	
	public StackImp(int size) {
		this.maxSize=size;
		stackArray=new Object[this.maxSize];
		this.top=-1;
	}
	public void push(Object newItem) {
		if (isFull()) {
			System.out.println("The Stack is Full....");
			return;
		}
		top++;
		stackArray[top]=newItem;
	}
	public boolean isFull() {
		return (top==maxSize-1);
	}
	public T pop() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty...");
			return null;
		}
		
		T item=(T)stackArray[top];
		top--;
		return item;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public T peek() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty...");
			return null;
		}
		T item=(T)stackArray[top];
		return item;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
