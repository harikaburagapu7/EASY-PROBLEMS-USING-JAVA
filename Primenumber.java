public class Primenumber 
{
    public static boolean isPrime (int n )
    {

        //cornor cases
        //2

        if(n == 2)
        {
            return true;

        }




        boolean isPrime = true;
        for(int i = 2; i <=n-1; i++)
        {
            if(n % i == 0)
            {// completly dividing  
                isPrime = false;
                break;
            }

            
        }

        return isPrime;

    }


    public static void main(String args[])
    {
        System.out.println((isPrime(5)));

    }

    
}
