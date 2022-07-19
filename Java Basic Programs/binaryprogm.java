package javacode;

import java.util.Scanner;

public class binaryprogm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-----Using Array------");
		int a[]=new int[20];
		System.out.println("Enter the number");
		int num=sc.nextInt();int i;
		int temp=num;
		for( i=0;num>0;i++) {
			a[i]=num%2;
			num=num/2;
			
		}
	   System.out.printf("Binarynumber is : ");
	   for(int j=i-1;j>=0;j--){
	       System.out.print(a[j]);	
	   }
	System.out.println(" ");
	System.out.println("------Without using array---------");
	int dig1;
	    System.out.println(temp);
		String d="";
	while(temp>0) {
		dig1=temp%2;
		d=dig1+""+d;
		temp=temp/2;}
	System.out.println("Binarynumber is: "+d);
	

}
}