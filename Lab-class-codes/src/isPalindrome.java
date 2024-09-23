public class isPalindrome {
    public static void main(String[] args) {
        String input = "madam";

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters from the start and end moving towards the center
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If no mismatches, it is a palindrome
    }
}
