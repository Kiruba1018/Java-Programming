import java.util.*;
class Selection {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size:");
    int size = s.nextInt();
    int a[] = new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<size;i++)
    {
        a[i] = s.nextInt();
    }
    System.out.println("Elements before Sorting:");
    for(int i=0;i<size;i++)
    {
        System.out.println(" "+a[i]);
    }
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            int temp = a[i];
            if(temp<a[j])
            {
                
            }
        }
    } 
 }   
}
