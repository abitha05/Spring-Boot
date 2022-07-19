package javacode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Student implements Comparable<Student>{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	//@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else 
			return -1;
}}
public class sortdemo {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> l1=new ArrayList<> ();
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		System.out.println("Enter the Student details (name/age)");
		for(int i=0;i<n;i++) {
			l1.add(new Student(sc.next(),sc.nextInt()));}
		System.out.println("Before sorting...");
		System.out.println("Student's list :"+l1);
		Collections.sort(l1);
		System.out.println("After sorting by age ...");
		System.out.println("Name"+"\t"+"Age");
		for(Student s:l1) {
	        System.out.println(s.name+"\t"+s.age);

}
}}