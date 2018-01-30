package deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
	int getdata(int marks1,int marks2,int marks3)
	{
		int add=marks1+marks2+marks3;
		return add;
		
	}
    void details(String name,int rollno)
    {
    System.out.println("name="+name);
    System.out.println("rollno="+rollno);
    }
    void Percent(int add)
    {
    	int avg=(add*100)/300;
    	System.out.println("percentage="+avg);
    }
    public static void main(String[] args) throws  IOException {
    	
    
        Demo1 obj=new Demo1();   
   		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("enter name and roll no");
        String name=br.readLine();
        int rollno=Integer.parseInt(br.readLine());
        obj.details(name,rollno);
        System.out.println("enter marks in three subjects");

        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        
        int var=obj.getdata(n1,n2,n3);
        System.out.println("total no are:"+var);
	    obj.Percent(var);
	}
}    
