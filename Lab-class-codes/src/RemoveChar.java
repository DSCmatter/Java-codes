public class RemoveChar {

    // Method to remove a given character from the input string
    public static String removeChar(String input, char ch) {
        // Create a new string that excludes the given character
        String result = input.replace(Character.toString(ch), "");
        return result;
    }

    public static void main(String[] args) {
        // Example input string
        String input = "programming"; // You can change this string for testing
        char charToRemove = 'g'; // Character to remove, can change this for testing

        // Call the method to remove the character
        String updatedString = removeChar(input, charToRemove);

        // Output the result
        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + charToRemove + "': " + updatedString);
    }
}
