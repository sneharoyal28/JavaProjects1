package xxx;
import java.util.Stack;
public class BurgerStack {

	public static void main(String[] args) {
		Stack<String> burgerStack=new Stack<String>();
		burgerStack.push( " 1");
		burgerStack.push( "2 ");
		burgerStack.push( " 3");
		System.out.println("top burger is"+burgerStack.peek());
		System.out.println("serving"+burgerStack.pop());
		if(burgerStack.isEmpty()) {
		  System.out.println("all burgers are served");
		}
	}

}
