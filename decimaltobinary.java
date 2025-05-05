public class decimaltobinary 
{
    public static  void binNum(int n)
    { // The `binNum` method in the given Java code is converting a decimal number to its binary representation. It iterates through the decimal number by continuously dividing it by 2 and storing the remainders in a variable `binNum`. The remainders are calculated using the modulo operator `%` and then multiplied by the corresponding power of 10 to build the binary representation. Finally, the binary representation is printed out.
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n > 0)
        {
            int rem = n % 2 ;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.println(binNum);

        


    }
    public static void main(String args[])
        {
            binNum(7);
        }
    
}
