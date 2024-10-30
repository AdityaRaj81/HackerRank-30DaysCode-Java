import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int intInput = scanner.nextInt();
        double doubleInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character
        String stringInput = scanner.nextLine();

        int sumOfIntegers = i + intInput;
        double sumOfDoubles = d + doubleInput;
        String concatenatedString = s + stringInput;

        System.out.println(sumOfIntegers);
        System.out.println(String.format("%.1f", sumOfDoubles));
        System.out.println(concatenatedString);
    }
}
