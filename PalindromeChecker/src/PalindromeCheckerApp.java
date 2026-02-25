import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<Character>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<Character>();

        // Enqueue and Push characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO (Enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) vs pop (stack)
        for (int i = 0; i < original.length(); i++) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        scanner.close();
            }
        }







