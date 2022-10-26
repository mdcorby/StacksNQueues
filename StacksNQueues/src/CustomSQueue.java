import java.util.Stack;

public class CustomSQueue {
	//add top top of Q1
	private Stack<Integer> Q1;
	//take from top of Q2
	private Stack<Integer> Q2;
	
	public CustomSQueue(Stack<Integer> a) {
		Q1=a;
		Q2=new Stack<Integer>();
	}
	
	//add to top of Q1 which is "end of queue"
	public void add(int a) {
		Q1.push(a);
	}
	
	public int poll() {
		int size = Q1.size();
		//revere the Stack in Q1 into Q2
		for(int i =0;i<size;i++) {
			int a = Q1.pop();
			Q2.push(a);
		}
		//define returning value as top of Q2 which was previously bottom of Q1 and remove top of Q2
		int ret = Q2.pop();
		//reverse Q2 without return value back into Q1
		//size-1 because removed one from stack/queue
		for(int i=0;i<size-1;i++) {
			int a = Q2.pop();
			Q1.push(a);
		}
		//return the value
		return ret;
	}
}
