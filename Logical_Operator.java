
  
public class Logical_Operator {
    public static void main(String[] args)
    {
        
        int a = 77, b = 564, c = 564, d = 0;
  
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
  
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}