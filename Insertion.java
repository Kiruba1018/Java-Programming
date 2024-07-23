
import java.util.Scanner;
public class Insertion {
    Node last;
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    Insertion()
    {
        last = null;
    }
    public void insertbegin(int val)
    {
     Node newnode = new Node(val);
     if( last == null)
     {
         newnode.next = newnode;
         last = newnode;
     }
     else
     {
         newnode.next = last.next;
         last.next = newnode;
     }
    }
    public void insertend(int val)
    {
     Node newnode = new Node(val);
     if( last == null)
     {
         newnode.next = newnode;
         last = newnode;
     }
     else
     {
         newnode.next = last.next;
         last.next = newnode;
         last = newnode;
     }
    }

    
    public void display()
    {
        Node temp = last.next;
        do{
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
         while(temp != last.next);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Insertion list = new Insertion();
        int val=0;
        int n = s.nextInt();
        
        for(int i=0;i<n;i++)
        {
             val = s.nextInt();
            list.insertend(val);
        }
        
        list.display();
        System.out.println();
        list.insertbegin(val);
        list.display();
        
        s.close();
    }
}