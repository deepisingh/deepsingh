package deep;

import java.util.Scanner;

public class Star {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a no");
	int n=sn.nextInt();
	for( i=0; i<n; i++)
	{
		for( j=0; j<n; j++)
		{
			if(i==j || i+j=n-1)
			{
				System.out.println("*");
			}
			else
			{
				System.out.println("");
			}
	
		}
	
	

