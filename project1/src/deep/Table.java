package deep;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
        int var=s.nextInt();
        System.out.println("no of multiple");
        int j=s.nextInt();
        int i=1;
        while (i<=j)
        {
        	int mul=i*var;
        	System.out.println(var+"*"+i+"="+mul);
			i++;
		}
	}
}
