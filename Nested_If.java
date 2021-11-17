import java.util.Scanner;
public class Nested_If
{
     public static void main(String []args)
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2=sc.nextInt();
        if( num1 < num2)
        { 
           System.out.println("num2 is greater=" +num2); 
           if(num1 > num2)
           {
	          System.out.println("num1 is greater=" +num1);
	       }
	    }
	    else
	    {
	        System.out.println("Both are equal");
	    }
     }
}