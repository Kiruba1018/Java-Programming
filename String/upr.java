/**
 * upr
 */
 import java.util.*;
 class upr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 ="";
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(Character.isUpperCase(c))
            {
                s2 = s2 + c;
            }
        }
        System.out.print(s2);
    }
    
}