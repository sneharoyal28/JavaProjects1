package sneha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

class MyArrayList {
	ArrayList<Integer> AL = new ArrayList<>();

	public MyArrayList() {
		AL.add(20);
		AL.add(30);
		System.out.println("ArrayList: " + AL);
	}
}

class MyLinkedList {
	LinkedList<Integer> LL = new LinkedList<>();

	public MyLinkedList() {
		LL.add(40);
		LL.add(50);
		System.out.println("LinkedList: " + LL);
	}
}

class MyHashMap {
	HashMap<Integer, String> HM = new HashMap<>();

	public MyHashMap() {
		HM.put(1, "varsha");
		HM.put(2, "honey");
		HM.put(3, "Lucky");
		System.out.println("HashMap: " + HM);
	}
}

class MyHashSet {
	HashSet<Integer> HS = new HashSet<>();

	public MyHashSet() {
		HS.add(10);
		HS.add(10);  // Duplicate, will be ignored
		HS.add(30);
		System.out.println("HashSet: " + HS);
	}
}

public class List {
	public static void main(String[] args) {
		MyArrayList AL = new MyArrayList();
		MyLinkedList LL = new MyLinkedList();
		MyHashMap HM = new MyHashMap();
		MyHashSet HS = new MyHashSet();
	}
}