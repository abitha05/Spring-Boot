package javacode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<> ();
		System.out.println("Enter the number of elements to add");
		int element=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<=element;i++) {
		      l1.add(sc.nextInt());
		}
		Collections.sort(l1);
		System.out.println("sorted list elements : "+l1);
	}

}
