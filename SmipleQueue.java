package xxx;
import java.util.LinkedList;
import java.util.Queue;


public class SmipleQueue {

	public static void main(String[] args) {
		Queue<String>students=new LinkedList<String>();
		students.add("stu1 ");
		students.add(" stu2");
		students.add("stu3 ");
		students.add(" stu4");
		System.out.println(students);
		String firstOut=students.poll();
		
		System.out.println(firstOut);
		String firstOut1=students.poll();
		System.out.println(firstOut1);
		System.out.println(students);
	
	}

}
