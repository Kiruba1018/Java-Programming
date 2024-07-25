import java.util.*;
public class At_end {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val)
        {
            data=val;
            next=null;
            prev=null;
        }
    
    }
    public void insertend(int val)
    {
        Node newnode = new Node(val);
        if(tail == null)
        {
           head = newnode;
           tail = newnode;
        }
        else
        {
            newnode.prev = tail;
            tail.next = newnode;
        }
        tail = newnode;

    }
    public void delatbeg()
    {
        Node temp = head;
        head = temp.next;
        head.prev = null;    
    }
    public void delatend()
    {
        Node temp = tail;
        tail = temp.prev;
        tail.next = null;

    }
    public void delatpos(int index)
    {
        Node temp = head;
        Node back = null;
        Node front = null;
        for(int i=1;i<index;i++)
        {
            back = temp;
            temp = temp.next;
            front = temp.next;
        }
        temp.next.prev = back;
        temp.prev.next = front;

    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }
    
    


    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        At_end list = new At_end();
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        System.out.println("Enter  values");
        for(int i=0;i<n;i++)
        {
            int val = s.nextInt();
            list.insertend(val);

        }
       list.display();
       list.delatbeg();
       System.out.println();
       list.display(); 
       list.delatend();
       System.out.println();
       list.display();
       System.out.println("Enter the index value to print:"); 
       int index = s.nextInt();
       list.delatpos(index);
       System.out.println();
       list.display();
        s.close();
    }

}    

