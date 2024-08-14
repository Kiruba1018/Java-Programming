import java.util.*;
class vectorcopy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector <Integer> v1 = new Vector<>();
        Vector <Integer> v2 = new Vector<>();
        while(true)
        {
            int val = s.nextInt();
            if(val == -1)break;
            v1.add(val);
        }
        System.out.print(v1);
        v2 = (Vector)v1.clone();
        System.out.print(v2);
        

    }
}
