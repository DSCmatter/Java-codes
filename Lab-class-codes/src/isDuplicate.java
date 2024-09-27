import java.util.HashSet;

public class isDuplicate {

    // Method to check if an array contains duplicate elements
    public static boolean checkDuplicate(int[] array) {
        // Create a HashSet to store unique elements
        HashSet<Integer> elements = new HashSet<>();

        // Iterate through the array
        for (int num : array) {
            // If the element is already in the set, it's a duplicate
            if (!elements.add(num)) {
                return true; // Duplicate found
            }
        }

        // If no duplicates were found
        return false;
    }

    public static void main(String[] args) {
        // Test the duplicate checking method
        int[] testArray = {1, 2, 3, 4, 5, 6}; // You can change this array for testing

        if (checkDuplicate(testArray)) {
            System.out.println("The array contains duplicate elements.");
        } else {
            System.out.println("The array does not contain duplicate elements.");
        }
    }
}
