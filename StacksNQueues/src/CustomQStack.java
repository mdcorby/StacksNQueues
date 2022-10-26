import java.util.Queue;

public class CustomQStack {
	private Queue<Integer> a;
	
	public CustomQStack(Queue<Integer> f) {
		a=f;
	}
	
	public void push(int b) {
		int size = a.size();
		
		//add to end of Queue
		a.add(b);
		
		//move everything in front of new val to behind like corcle
		for (int i=0;i<size;i++) {
			int c = a.remove();
			a.add(c);
		}
	}
	
	public int pop() {
		//remove the front since the front will always be the "top" of the stack
		return a.remove();
	}
	
	public boolean empty() {
		int size = a.size();
		//if nothing in return that it is empty (true)
		if(size==0) {
			return true;
		}
		//if something in it return not empty (false)
		return false;
	}
}