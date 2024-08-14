import java.util.*;
class easy
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList <Integer>list2 = new ArrayList<>();
        while(true)
        {
         int val = s.nextInt();
         if(val == -1)break;
         list1.add(val);
        }

        System.out.println("List 1 values are:");
        System.out.print(list1);
        list2 = (ArrayList)list1.clone();
        System.out.println("List 2 values are:");
        System.out.println(list2);
    }
}