class isLowercaseAndUppercase {
    public static void main(String[] args) {
        String input = "HelloWorld";

        if (containsLowercaseAndUppercase(input)) {
            System.out.println("The string \"" + input + "\" contains both lowercase and uppercase letters.");
        } else {
            System.out.println("The string \"" + input + "\" does not contain both lowercase and uppercase letters.");
        }
    }

    public static boolean containsLowercaseAndUppercase(String str) {
        boolean hasLowercase = false;
        boolean hasUppercase = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            // If both conditions are met, no need to continue checking
            if (hasLowercase && hasUppercase) {
                return true;
            }
        }
        return hasLowercase && hasUppercase;
    }
}
