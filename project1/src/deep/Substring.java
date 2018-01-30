package deep;
import java.util.Scanner;
import java.lang.String;

public class Substring {
public static void main(String[] args) {
	
	System.out.println("enter a string");
	Scanner sn=new Scanner(System.in);
	String str=sn.nextLine();
	
	String longest="";
	int maxlength=0;
	
	
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			if(arr[i].length()>maxlength)
			{
				maxlength=arr[i].length();
				longest=arr[i];
			}	
			}
		System.out.println("longest is:"+longest);
		}
}



