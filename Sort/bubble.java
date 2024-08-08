import java.util.*;
class bubble{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the values of array:");
        for(int i=0;i<size;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Elements before Sorting:");
        for(int i=0;i<size;i++)
        {
            System.out.println("  "+a[i]);
        }
       

        

         for(int i=0;i<size;i++)
            {
            for(int j=i+1;j<size;j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
            }
        
            System.out.println("Element after Sorting:");
            for(int i=0;i<size;i++)
            {
             System.out.println("  "+a[i]);
            }
                

         
        

        
    }

  

   
}