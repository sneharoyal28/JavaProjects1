package xyz;
interface Printtable {
	void print();
}
class Message implements Printtable {
	public void print() {
		System.out.println("hello from INTERFACE");
	}
}
public class InterfaceExample {
	public static void main(String []args) {
		Message msg=new Message();
		msg.print();
	}
}