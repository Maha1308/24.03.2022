package com.edu;

import java.util.Iterator;
import java.util.TreeSet;


public class Mainclass {

	public static void main(String[] args) {
		TreeSet<Float> tob= new TreeSet<Float>();
		tob.add(4983.23f);
		tob.add(43483.23f);
		tob.add(4233.23f);
		System.out.println("ascending order");
		Iterator<Float> iob=tob.iterator();
		while (iob.hasNext()) {
			System.out.println(iob.next());
		}
		System.out.println("descending order");
		Iterator<Float> iob1=tob.descendingIterator();
		while (iob1.hasNext()) {
			System.out.println(iob1.next());
		}
		
	}

}
