import java.util.Scanner;

public class Main {
    public static String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        boolean changed = false;

        // Iterate through the string to find the first character that isn't 'a'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                // Start changing characters to their previous alphabet character
                while (i < chars.length && chars[i] != 'a') {
                    chars[i] = (char) (chars[i] - 1); // Replace with the previous character
                    i++;
                }
                changed = true;
                break;
            }
        }

        // If the entire string consists of 'a's, change the last character to 'z'
        if (!changed) {
            chars[chars.length - 1] = 'z';
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input: The string s
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        // Get the lexicographically smallest string
        String result = getSmallestString(s);

        // Output the result
        System.out.println("The lexicographically smallest string is: " + result);
    }
}