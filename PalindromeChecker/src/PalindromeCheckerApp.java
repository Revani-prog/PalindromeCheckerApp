
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array
        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Check palindrome
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}








