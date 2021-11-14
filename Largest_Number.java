public class Largest_Number
{
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=20;
      if(x>y && x>z)
      { 
          System.out.println("largest number is="+x);
      }
      else if(y>x && y>z)
      {
          System.out.println("largest number is ="+y);
      }
      else
      {
          System.out.println("largest number is="+z);
      }
}
}