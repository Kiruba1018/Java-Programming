import java.util.*;
class vectorinsert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector <Integer> v = new Vector<>();
        while(true)
        {
            int val = s.nextInt();
            if(val == -1)break;
            v.add(val);
        }
        System.out.println(v);
        v.add(4,20);
        System.out.print(v);

    }
}
