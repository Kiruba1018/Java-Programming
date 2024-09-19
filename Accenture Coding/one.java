import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         for(int i =n1;i<=n2;i++)
         {
             if(i<100)
             {
                 if(!(i%11==0)) System.out.print(i+" ");
             }
             else
             {
                 int num = i;
                 boolean flag = true;
                 Set<Integer> set = new HashSet<>();
                 while(num>0)
                 {
                     int rem = num%10;
                     if(set.contains(rem))
                     {
                         flag = false;
                         break;
                     }
                     set.add(rem);
                     num/=10;
                 }
                 if(flag) System.out.print(i+" ");
             }
         }
    }
}