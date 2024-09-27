public class isPrime {

    // Method to check if a number is prime
    public static boolean checkPrime(int number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number other than 1 and itself, it's not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Test the prime checking method
        int testNumber = 3; // You can change this number for testing
        if (checkPrime(testNumber)) {
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }
    }
}
