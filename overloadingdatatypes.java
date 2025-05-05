public class overloadingdatatypes 
{
    // calcuate the integer sum
    public static  int sum(int a , int b)
    {
        return a+ b;
    }
    // calculate the float sum

    public static float sum ( float a , float b )
    {
        return a + b;
    }

    // calling the two sum methods
    public static void main(String args[])
    {
        System.out.println(sum(1, 6));
        System.out.println(sum(1.5f, 2.5f));
    }

}
