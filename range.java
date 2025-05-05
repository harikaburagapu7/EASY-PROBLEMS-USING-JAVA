public class range 
{

    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        //  this is the code for the optimized prime number
        
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)

            {
                return false;
                

            }
            
        }

        return true;


    }


    public static void primes(int n)
    {
        for (int i = 2; i <= n ; i++)
        {
            if (isPrime(i ))
            {// it cheaks for the each and every number from the 2 to n and if the number is prime then it will print the number
                //return true;
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        // System.out.println(isPrime(16));
        primes(20);

    }
    
}
