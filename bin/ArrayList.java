package sneha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

 class ArrayList {

	public  ArrayList() {
		ArrayList<Integer> AL=new ArrayList<Integer>();
		AL.add(20);
		AL.add(40);
	
		System.out.println("ArrayList",+AL);
	}
	}

	class LinkedList extends ArrayList {
		public  LinkedList() {
			LinkedList<Integer> LL=new LinkedList<Integer>();
			LL.add(10);
			LL.add(20);
		
			System.out.println("LinkedList",+LL);
		}
	}
	
	class HashMap extends ArrayList {
		public  HashMap () {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(1,"sai");
			hm.put(2,"sonu");
		
			System.out.println("HashMap",+hm);
		}
	}
	class HashSet extends ArrayList {
		public   HashSet() {
			HashSet <Integer> hs=new HashSet<Integer>();
			hs.add(20);
			hs.add(40);
		
			System.out.println("HashSet",+hs);
		}
	}


	public class ArrayList {
		public static void main(String[] args) {
			MyArrayList AL = new MyArrayList();
			MyLinkedList LL = new MyLinkedList();
			MyHashMap HM = new MyHashMap();
			MyHashSet HS = new MyHashSet();
		}
	}