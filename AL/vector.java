import java.util.*;
class vector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector <Integer> v = new Vector<>();
        int count = 0;
        while(true)
        {
            int val = s.nextInt();
            if(val == -1)break;
            count++;
            v.add(val);
        }
        System.out.println(v);
        System.out.println(count);

    }
}
