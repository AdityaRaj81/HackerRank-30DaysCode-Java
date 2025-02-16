import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Solution {
    
       // Stack for storing characters in LIFO order
    private Stack<Character> stack = new Stack<>();
    // Queue for storing characters in FIFO order
    private Queue<Character> queue = new LinkedList<>();

    // Pushes a character onto the stack
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Enqueues a character in the queue
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // Pops and returns the character from the top of the stack
    public char popCharacter() {
        return stack.pop();
    }

    // Dequeues and returns the character from the front of the queue
    public char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
                 // Read input string from stdin
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();

        // Enqueue and push all characters of input string
        for (char ch : input.toCharArray()) {
            solution.pushCharacter(ch);
            solution.enqueueCharacter(ch);
        }

        // Check if input string is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (solution.popCharacter() != solution.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The word, " + input + ", is a palindrome.");
        } else {
            System.out.println("The word, " + input + ", is not a palindrome.");
        }
    }
}
