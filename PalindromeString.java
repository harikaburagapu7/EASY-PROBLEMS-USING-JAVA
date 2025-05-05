public class PalindromeString {
    public static void   Number(String str)
    {
        int n = str.length() ;
        for(int i=0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                System.out.println("palindrome");
               

            }
            else{
                System.out.println("it is not an palindrome");
            }

        }


    }
    public static void main(String args[])
    {
        String str = "racecar";
        Number(str);
    }
}
