package com.edu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class student
{
	int id;
	String name;
	
	

public student(int sid, String sname)
{
	super();
	this.id=sid;
	this.name=sname;
	
}
}
class studentcompare implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		if(o1.id==o2.id)
			return 0;
		else if(o1.id>o2.id)
		return 1;
		else
			return-1;
	}
}
	class studentcomparename implements Comparator<student>
	{

		@Override
		public int compare(student o1, student o2) {
			if(o1.id==o2.id)
				return 0;
			else if(o1.id>o2.id)
			return 1;
			else
				return-1;
		}
	}
		
	

public class TreesetStudent {
	

	public static void main(String[] args) {
		TreeSet<student> tob=new TreeSet<student>(new studentcompare());
		student tob1=new student(62,"Veena");
		student tob2=new student(83,"meena");
		student tob3=new student(91,"Reena");
		tob.add(tob1);
		tob.add(tob2);
		
		tob.add(tob3);
		System.out.println("Sorting based on id");
		Iterator<student>it=tob.iterator();
		while(it.hasNext()) {
			student eob=it.next();
			System.out.println("SID="+eob.id+ ",name="+eob.name);
			
			
		
	
	}
}
}


