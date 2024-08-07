import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            System.out.println(c+" "+(int)c);
        }
    }
}
