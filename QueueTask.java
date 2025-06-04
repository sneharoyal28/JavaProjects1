package xxx;
import java.util.LinkedList;
import java.util.Queue;
public class QueueTask {

	public static void main(String[] args) {
		Queue<String>kids=new LinkedList<String>();
		kids.add(" icecream1");
		kids.add(" icecream2");
		kids.add(" icecream3");
		kids.add(" icecream4");
		kids.add(" icecream5");
		kids.add(" icecream6");
		System.out.println(kids);
		String firstOut=kids.poll();
		System.out.println(firstOut);
		String firstOut1=kids.poll();
		System.out.println(firstOut1);
		System.out.println(kids);
		kids.add("icecream7");
		System.out.println(kids);
	}

}
