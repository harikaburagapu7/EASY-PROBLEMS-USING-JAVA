import java.util.Scanner;

public class fact 
{
    
    public static int multiply(int a, int b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterr a :");
        a = sc.nextInt();

        System.out.println("Enter b :");
        b = sc.nextInt();

        int prod = a*b;
        return prod;


    }


    public static int factorial(int n)
    {
        int f = 1;

        for(int i =1; i <= n; i++)
        {
            f = f * i;


        }
        return f;
        // this is the factorial of the n 

    }




    public static void main(String args[])
    {
        System.out.println(factorial(4));

    }



}


