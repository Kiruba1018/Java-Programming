import java.util.*;
class easy
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0)
        {
            n--;
            sb.insert(0,(char)('A'+n%26));
            n/=26;
        }
        System.out.print(sb.toString());
        
    }
}