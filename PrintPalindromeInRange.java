public class PrintPalindromeInRange {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;    // Store the original number
        int reverse = 0;       // To store the reversed number

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;  // Get the last digit of num
            reverse = reverse * 10 + digit; // Add it to the reverse number
            num /= 10;   // Remove the last digit from num
        }

        // Check if the reversed number equals the original number
        return original == reverse;
    }

    // Function to print palindromic numbers in a range
    public static void findPalindromes(int min, int max) {
        // Loop over all numbers from min to max
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");  // If palindrome, print the number
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int min = 10, max = 50;  // Example 1 range
        System.out.println("Palindrome numbers between " + min + " and " + max + ":");
        findPalindromes(min, max);  // Call the function to find and print palindromes
        System.out.println();  // For better formatting

        min = 100; max = 150;  // Example 2 range
        System.out.println("Palindrome numbers between " + min + " and " + max + ":");
        findPalindromes(min, max);  // Call the function again with a different range
    }
}
