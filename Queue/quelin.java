import java.util.*;
class quelin
{
    Node head;

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
    quelin()
    {
        head = null;
    }
    public void insertend(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void deletebegin()
    {
        head=head.next;
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
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        quelin list = new quelin();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val  = sc.nextInt();
            list.insertend(val);
        }
        list.deletebegin();
        list.display();
    }
}
