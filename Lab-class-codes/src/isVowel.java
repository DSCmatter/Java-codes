class IsVowel {
    public static void main(String[] args) {
        String input = "example";

        int vowelCount = countVowels(input);
        System.out.println("The string \"" + input + "\" contains " + vowelCount + " vowels.");
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // Convert each char to lowercase
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
