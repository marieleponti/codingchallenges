package for_CTCI;

import java.util.EmptyStackException;

//import for_CTCI.StackMin.MyStack.StackNode;

public class MyStack<T>{
	private class StackNode<T>{
		T data;
		StackNode<T> next;
		
		public StackNode(T new_data){
			this.data = new_data;
		}
	}
	
	StackNode<T> top;
	
	public void push(T element) {
		StackNode<T> newNode = new StackNode<T>(element);
		newNode.next = top;
		top = newNode;
	}
	
	public T pop() {
		if (isEmpty()) throw new EmptyStackException();
		T temp = top.data;
		top = top.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
}
