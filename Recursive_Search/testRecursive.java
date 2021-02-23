import java.util.Scanner;
public class testRecursive{
    
    public static int recursiveProduct(int param1, int param2) {//the OOP for this method matters
        if(param1 < param2){ //first check that param1 is not smaller than param2, this ensures that the next if statement will work unless param 2 is 0
            return recursiveProduct(param2, param1);//parameters are swapped in the case that the if statement is true
        }

        else if(param2 !=0){ //this is where the recursion occurs, param1 is added to the regressed product of param 2 and itself (eventually param 2 will be zero and the recursion will end)
            return(param1 + recursiveProduct(param1, param2-1));//works like 4 + (4*(3-1)) which becomes 4 + (4*(2-1)) and 4 + (4*(1-1)) to show the full 'loop'
        }

        else{
            return 0;
        }
    }

    

    public static void main(String[] args) {
        //using a scanner for input in the command line
        Scanner scanParam = new Scanner(System.in);
        int a, b, output;
        
        System.out.println("This program multiplies a and b:\n");
        
        System.out.print("Please enter a: ");
        a = scanParam.nextInt();
        
        System.out.print("\nPlease enter b: ");
        b = scanParam.nextInt();
        
        scanParam.close(); 
        
        output = recursiveProduct(a, b); //method is called and the output assigned to a variable
        
        System.out.println(a + " and " + b);
        System.out.println(a + " * " + b + " = " + output);
        
    }
}