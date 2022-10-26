import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("QStack Stuff:");
		//create empty Queue
		Queue<Integer> a = new LinkedList<Integer>();
		//put in queue for QStack
		CustomQStack b = new CustomQStack(a);
		System.out.println("Test if QStack is empty (it should be)");
		System.out.println(b.empty());
		System.out.println("Push 1,2,3, test if QStack is empty (it shouldn't be), and pop one");
		b.push(1);
		b.push(2);
		b.push(3);
		System.out.println(b.empty());
		System.out.println(b.pop());
		System.out.println("push 4, and pop twice more (I didn't mean for this to rhyme)");
		b.push(4);
		System.out.println(b.pop());
		System.out.println(b.pop());
		
		System.out.println();
		System.out.println("SQueue Stuff:");
		//SQueue stuff
		Stack<Integer> c = new Stack<Integer>();
		CustomSQueue SQ = new CustomSQueue(c);
		System.out.println("Add 1,2,3, then poll twice");
		SQ.add(1);
		SQ.add(2);
		SQ.add(3);
		System.out.println(SQ.poll());
		System.out.println(SQ.poll());
		System.out.println("Add 4 then poll once again");
		SQ.add(4);
		System.out.println(SQ.poll());
	}

}
