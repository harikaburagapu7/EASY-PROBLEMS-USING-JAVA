// 121 ---------> 121

public class palindromeNumber {
    public static void main(String args[])
    {
        int n=13212;
        int temp;
        int rev=0;
        int original_Number = n;
        
        for(int i=0;i<n;i++)
        {
            while(n != 0)
            {
                int digit = n %10;
                rev = rev*10+digit;
                 n = n/10;
                
            }
            if(original_Number == rev)
            {
                System.out.println("it is a palindrome Number");
            }
            else
            {
                System.out.println("It is not an palindrome Number");
            }
            
            
        }
        
    }

    
}
