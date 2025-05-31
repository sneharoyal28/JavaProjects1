package xyz;
		import java.util.HashSet;

		import java.util.Scanner;
		public class studentHashSet {
			public static void main(String[] args) {
				HashSet<String> students = new HashSet<String>();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Name 5 students");
				for(int i=1;i<=5;i++) {
					System.out.println("Enter name of students "+i+"");
					String name= sc.nextLine();
					students.add(name);
				}
				System.out.println("Students name are:");
				for(String student:students) {
					System.out.println(student);
				}
			}

		
	}


