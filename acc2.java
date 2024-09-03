import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();
        
        int c =0;
        int a = 0;
        
        while(st<=e)
        {
            int n = st;
            while(n>0)
            {
                if(n>9) a=n%10;
                else a=n;
                if(a==k) c++;
                n/=10;
            }
            st++;
        }
        System.out.print(c);
    }
}