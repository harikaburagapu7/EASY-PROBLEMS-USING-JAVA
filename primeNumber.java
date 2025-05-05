public class primeNumber {
    public static void main(String args[]) {
        int num = 27;
        boolean isPrime = true;

        // Check if it is prime or not
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print result (outside the loop)
        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
