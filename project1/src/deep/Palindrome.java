package deep;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int c=0,temp,a;
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sn.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=(c*10)+a;
		}
		if(temp==c)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome"); 	

	}

}
