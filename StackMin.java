package for_CTCI;

public class StackMin extends MyStack<Integer> {
	
	MyStack<Integer> stackMins;
	
	public StackMin() {
		stackMins = new MyStack<Integer>();
	}
	
	public void push(int element) {
		if (element <= min()) {
			stackMins.push(element);
		}
		super.push(element);
	}
	
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			stackMins.pop();
		}
		return value;
	}
	
	public int min() {
		if (stackMins.isEmpty()) return Integer.MAX_VALUE;
		return stackMins.peek();
	}
	
	public static void main(String[] args) {
		StackMin s0 = new StackMin();
		s0.push(4);
		s0.push(3);
		s0.push(7);
		s0.push(9);
		
		System.out.println("Find min in stack (top) 9 7 3 4: " + s0.min());
		
		s0.pop();
		System.out.println("Find min in stack (top) 7 3 4: " + s0.min());
		
		s0.pop();
		System.out.println("Find min in stack (top) 3 4: " + s0.min());
		
		StackMin s1 = new StackMin();
		s1.push(2);
		s1.push(5);
		s1.push(1);
		s1.push(4);
		
		System.out.println("Find min in stack (top) 4 1 5 2 : " + s1.min());
		
		s1.pop();
		System.out.println("Find min in stack (top) 1 5 2 : " + s1.min());
		
		s1.pop();
		System.out.println("Find min in stack (top) 5 2 : " + s1.min());
	}
	
}
