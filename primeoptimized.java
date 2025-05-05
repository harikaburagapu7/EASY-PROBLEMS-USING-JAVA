public class primeoptimized 
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
    public static void main(String args[])
    {
        System.out.println((isPrime(3)));
    }
    
}
