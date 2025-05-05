import java.util.Scanner;
public class scope {
public static int user(int s){
            s= 45;
            System.out.println(s);
            return s;
    }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the value of s: ");
        int s=sc.nextInt();
        
    int result = user (s);
    System.out.println(" the final value is: "+ result);
    }
    
}
