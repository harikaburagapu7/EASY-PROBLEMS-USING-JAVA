import java.util.Scanner;

public class product 
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

    public static void main(String args[])
    {
        int a = 2;
        int b = 4;
        int prod = multiply(2 , 4);
        System.out.println("a * b :" + prod);


        prod = multiply(3, 7);
        System.out.println("a * b :" + prod);

        
    }
    

}
