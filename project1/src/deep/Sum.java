package deep;

import java.util.Scanner;


public class Sum {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int sum=0;
	System.out.println("enter value of iteration is");
	int j=sn.nextInt();
	
    System.out.println("enter value of i=");	
	for (int i =0;i<=10;i++)
	{
		int var=sn.nextInt();
		sum=sum+var;
	

	
	}

	System.out.println("sum="+sum);
}
}


