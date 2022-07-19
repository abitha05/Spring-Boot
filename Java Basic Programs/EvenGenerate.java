package javacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EvenGenerate {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<>();
		System.out.println("Enter the number of elements to generate");
		int elements=sc.nextInt();
		Random random=new Random();
		for(int i=0;i<elements;i++) {
			l1.add(random.nextInt(50));
	     }
		System.out.println("Genereated elements are");
		for(Integer k:l1){
			System.out.println(k);
		}
		System.out.println("even numbers are");
	    l1.stream().filter(j -> j % 2 == 0).forEach(System.out::println);
		
		
}
}