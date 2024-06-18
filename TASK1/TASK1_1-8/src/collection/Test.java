package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameCompare implements Comparator<Test>{
	public int compare(Test t1,Test t2) {
		return t1.getName().compareTo(t2.getName());
	}
}

public class Test implements Comparable<Test>{
	
	private int age;
	private String name;
	
	public Test(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Object " + "-> Name : " + this.name + " | Age : "+this.age;
	}
	
	@Override
	public int compareTo(Test t) {
		return this.age - t.age;
	}
	public static void main(String[] args) {
		Test obj1 = new Test(22,"Bhagya");
		Test obj2 = new Test(30,"Bhavya");
		Test obj3 = new Test(25,"Ariyan");
		ArrayList<Test> a1 = new ArrayList<>();
		a1.add(obj1);
		a1.add(obj2);
		a1.add(obj3);
		
		//sorting based on AGE
		System.out.println("SORTING BASED ON AGE");
		Collections.sort(a1);
		a1.forEach(System.out::println);
		
		//sorting based on name
		System.out.println("SORTING BASED ON NAME");
		NameCompare n1 = new NameCompare(); 
		Collections.sort(a1,n1);
		a1.forEach(System.out::println);
		
	}

}
