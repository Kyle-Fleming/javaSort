import java.util.Scanner;
public class TestRecursionMult
{
  public static int timesX(int x,int n)
  {
    int prod;   
    if (n==0) // if(n==1)
       return 0; // return x;
    else
    {
     prod = timesX(x,n-1);
     return (x+prod);  // return (x+TimesX(n-1));
    } 
  } 
  public static void main(String[] args)
  {
     
     Scanner in = new Scanner(System.in);
     
     int a=0;
     int b=0;
     int output = 0;

 
     System.out.printf("\nThis program computes a*b, please enter a: ");
     a = in.nextInt();
     System.out.printf("\nThis program computes a*b, please enter b: ");
     b = in.nextInt();
     System.out.printf("\n%d and  %d",a,b);
     output = timesX(a,b);
     System.out.printf("\n%d * %d = %d",a,b,output);
   
   }
}   


