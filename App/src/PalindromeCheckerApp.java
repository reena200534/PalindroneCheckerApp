class PalindromeCheck {
    public static void main(String[] args) {

        // Hardcoded string
        String str = "radar";
        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Check palindrome using if-else
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}