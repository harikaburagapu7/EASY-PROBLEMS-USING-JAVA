// 153 ------> 1^3 + 5^3 + 3^3 = 1+125+27=153
import java.util.Scanner;
public class armstrong {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your own number:");
        int number =sc.nextInt();
        // int number = 153;
        int original_number=number;
        int result = 0;
        for(int i = 0; i < number ; i++)
        {
            while(number != 0)
            {
                int digit = number%10;
                result += Math.pow(digit,3);
                number = number/10;

            }
            
            if(result == original_number)
            {
                System.out.println("Armstrong Number");
            }
            else{
                System.out.println("it is not an Armstrong Number");
            }
        }
    }
    
}
