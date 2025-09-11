public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;  // you can change this value
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (num <= 1) {
            isPrime = false;
        } else {
            // check from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}
