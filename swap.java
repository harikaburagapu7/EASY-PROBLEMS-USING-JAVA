
public class swap
{
    public static void swapp( int a, int b)
    {
        int temp = a; 
        a = b;
        b = temp;

        
    }

    public static void main(String args[])
    {

        // swapping the two values
        int a = 5;
        int b = 2;

        swapp(a, b);

        System.out.println("the value of a is :" + a);
        System.out.println("THe value of the b is :" + b);
        
        
        
    }
}
