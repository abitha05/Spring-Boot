package javacode;

import java.util.Scanner;
class digits{
	 String a[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen"
            ,"Seventeen","Eighteen","Ninteen"};
public String dig(int num) {
	return(a[num]);
}
public void twodig(int num1,int num2) {
   switch(num2) {
	case 2:
		System.out.println("Twenty "+a[num1]);break;
	case 3:
		System.out.println("Thirty "+a[num1]);break;
	case 4:
		System.out.println("Fourty "+a[num1]);break;
	case 5:
		System.out.println("Fifty "+a[num1]);break;
	case 6:
		System.out.println("Sixty "+a[num1]);break;
	case 7:
		System.out.println("Seventy "+a[num1]);break;
	case 8:
		System.out.println("Eighty "+a[num1]);break;
	case 9:
		System.out.println("Ninty "+a[num1]);break;}
}
}
public class numberwords {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  digits obj=new digits();
    	  System.out.println("Enter the number");int dig=0;
    	  int num=sc.nextInt();int temp=num;
    	  while(num!=0) {
    		  num=num/10;
    		  dig++;}
    	  if(temp==0) {
    		  System.out.println("Zero");
    	  }
    	  else if((dig==1 )||(dig==2 && temp<20))
    	  {
    		  System.out.println(obj.dig(temp));
    	  }
    	  else if(dig==2 && temp>19) { 
    		 int dig1=temp%10;
    		 int dig2=temp/10;
    			 obj.twodig(dig1,dig2);}
    	  else {
    		  System.out.println("Hundred");}
    		  
  }}

