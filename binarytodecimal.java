public class binarytodecimal
{
    public static void binTodec(int binNum)
    {
        int decNum = 0;// to get the final value
        int pow = 0;

        int myNum = binNum;
        while(binNum > 0)
        {
            // to get the last digit
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit + (int)Math.pow(2 , pow));
            
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decimal of " + myNum +"=" + decNum);
    }
    
        public static void main(String args[])
        {
            binTodec(1010);
        }
    


}



