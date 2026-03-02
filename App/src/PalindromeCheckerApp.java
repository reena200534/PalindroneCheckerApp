 class PalindromeCheckerApp{

    // Application constants
    private static final String APP_NAME = "Palindrome Checker";
    private static final String APP_VERSION = "Version 1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        displayWelcomeMessage();

        // Program can continue to next use case here
        // For UC1, we simply exit after welcome message

        System.out.println("\nApplication is ready.");
        System.out.println("Exiting application. Goodbye!");
    }

    // Method to display welcome message
    private static void displayWelcomeMessage()
    {
        System.out.println("=================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("=================================");
    }
}