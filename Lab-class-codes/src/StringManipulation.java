public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Hello, World!";

        // Length
        System.out.println("Length: " + str1.length());

        // Character at index
        System.out.println("Character at index 0: " + str1.charAt(0));

        // Concatenation
        String str2 = str1 + " How are you?";
        System.out.println("Concatenated: " + str2);

        // Substring
        System.out.println("Substring (7, 12): " + str1.substring(7, 12));

        // Replace
        System.out.println("Replaced: " + str1.replace("World", "Java"));

        // Split
        String[] words = str1.split(", ");
        System.out.println("Split: " + java.util.Arrays.toString(words));

        // Trim
        String str3 = "   Java Programming   ";
        System.out.println("Trimmed: '" + str3.trim() + "'");
    }
}
