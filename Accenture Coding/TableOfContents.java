import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableOfContents {

    public static List<String> tableOfContents(String[] text) {
        List<String> toc = new ArrayList<>();
        int chapterCount = 0;
        int sectionCount = 0;

        for (String line : text) {
            if (line.startsWith("# ")) {
                chapterCount++;
                sectionCount = 0;
                toc.add(chapterCount + ". " + line.substring(2));
            } else if (line.startsWith("## ")) {
                sectionCount++;
                toc.add(chapterCount + "." + sectionCount + ". " + line.substring(3));
            }
        }

        return toc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of lines
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] text = new String[n];

        // Read the input lines
        for (int i = 0; i < n; i++) {
            text[i] = scanner.nextLine();
        }

        // Generate the table of contents
        List<String> result = tableOfContents(text);

        // Print the table of contents
        for (String line : result) {
            System.out.println(line);
        }

        scanner.close();
    }
}