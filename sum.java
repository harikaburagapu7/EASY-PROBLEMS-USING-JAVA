import java.util.Scanner;

public class sum 
{
    public static int  sumofintegers(int a , int b)
    {
        
        int sum = a + b;
        return sum;


    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int sum = sumofintegers(a, b);
        
        System.out.println("the sum of the value of a  b is : " + sum);
        
    }
}
