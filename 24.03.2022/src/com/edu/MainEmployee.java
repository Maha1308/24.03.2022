package com.edu;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

class Employee{
	int Eid;
	String Name;
	float Esalary;
	String Edeptname;
	
	public Employee(int Eid, String Name, float Esalary, String Edeptname) {
		super();
		this.Eid=Eid;
		this.Name=Name;
		this.Esalary=Esalary;
		this.Edeptname=Edeptname;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Name=" + Name + ", Esalary=" + Esalary + ", Edeptname=" + Edeptname + "]";
	}
}
class Employeesort implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.Eid>o2.Eid)
			return 1;
		else if(o1.Eid<o2.Eid)
			return -1;
		else 
			return 0;
	}

}
class Employeesortsalary implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.Eid>o2.Eid)
			return 1;
		else if(o1.Eid<o2.Eid)
			return -1;
		else 
			return 0;
	}

}
public class MainEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(156, "Maha", 8000.25f, "IT");
		Employee emp2 = new Employee(154, "Rio", 7500.50f, "EEE");
		Employee emp3 = new Employee(153, "Naveen", 10000.32f, "CSE");
		
		
		//ArrayList
		ArrayList<Employee> Elist = new ArrayList<Employee>();
		Elist.add(emp1);
		Elist.add(emp2);
		Elist.add(emp3);
	
		System.out.println(Elist);
		System.out.println("Before sorting");
		
		//Iterator
		Iterator<Employee> Eid=Elist.iterator();
		while(Eid.hasNext()) {
			Employee eob=Eid.next();
			System.out.println(eob.Eid+" "+eob.Name+" "+eob.Esalary+" "+eob.Edeptname);
		}
		Collections.sort(Elist,new Employeesort());
		System.out.println("after sort ");
		Iterator<Employee> Eid1=Elist.iterator();
		while(Eid1.hasNext()) {
			Employee eob=Eid1.next();
			System.out.println(eob.Eid+" "+eob.Name+" "+eob.Esalary+" "+eob.Edeptname);
			
		}
	
		Collections.sort(Elist,new Employeesortsalary());
		
		Iterator<Employee> Eid2=Elist.iterator();
		while(Eid1.hasNext()) {
			Employee eob=Eid2.next();
			System.out.println(eob.Eid+" "+eob.Name+" "+eob.Esalary+" "+eob.Edeptname);
		}
	}

}
