import java.util.Arrays;

public class isAnagram {

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String str1, String str2) {
        // If the lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test the anagram checking method
        String string1 = "listen"; // You can change this for testing
        String string2 = "silent"; // You can change this for testing

        if (checkAnagram(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}
