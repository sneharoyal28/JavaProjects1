package xxx;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("p1");
		stack.push("p2");
		stack.push("p3");
		stack.push("p4");
		stack.push("p5");
		System.out.println(stack);
 System.out.println("take out the plate after eat" + stack.peek());
 System.out.println("after take the plate"+stack.pop());
 System.out.println("leave the plate"+stack.size());


	}

}
