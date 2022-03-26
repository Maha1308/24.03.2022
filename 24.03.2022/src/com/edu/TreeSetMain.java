package com.edu;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<String> tob=new TreeSet<String>();
		tob.add("Veena");
		tob.add("Mahi");
		tob.add("Shanmugam");
		tob.add("Sri");
		
		
		System.out.println(tob);
		System.out.println("ascending order");
		Iterator<String> it=tob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****************************");
		System.out.println("decending order");
		Iterator<String> it1=tob.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
