public class Utility {

    // 1. Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 2. Find maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 3. Reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 4. Check if string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    // 5. Calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 5 and 8: " + max(5, 8));
        System.out.println("Reverse of 'Java': " + reverseString("Java"));
        System.out.println("Is empty string? " + isNullOrEmpty(""));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
