package deep;
 
   import java.util.Scanner;

   public class Dem {
      public static void main(String[] args) {
      Scanner sn=new Scanner(System.in);
      System.out.println("enter three no");
      int a=sn.nextInt();
      int b=sn.nextInt();
      int c=sn.nextInt();
     
      int var =a>b? a>c? a:c:b>c?b :c;
      System.out.println("greatest no="+var);
      
      
    	  
    	  
      
       
      
   	
   	
}
   }
