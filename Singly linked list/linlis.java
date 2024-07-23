import java.util.Scanner;

public class linlis {
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
    linlis()
    {
        head = null;
    }
    public void insertbegin(int val1)
    {
     Node newnode = new Node(val1);
     if(head == null)
     {
      head = newnode;  
     }
     else
     {
      newnode.next=head;
      head = newnode;
     }   
    }
    public void insertpos(int p,int val3)
    {
     Node newnode = new Node(val3);
     Node temp = head;
     for(int i=1 ;i<p ;i++)
     {
      temp=temp.next;
     }
     newnode.next=temp.next;
     temp.next = newnode;   
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
    public void search(int val2)
    {
        Node temp = head;
        int i=1;
        while(temp != null)
        {
         if(val2==temp.data)
         {
          System.out.println(temp.data+" is found at the index "+i);
          break;  
         }
         else{   
         temp = temp.next;
         i++;
        }
        }
    }
    public void delbegin()
    {
     head = head.next;    
    }
    public void delpos(int ind)
    {
     Node temp = head;
     Node prev = null;
     for(int i=1;i<ind;i++)
     {
      prev = temp;
      temp = temp.next;  
     } 
     prev.next=temp.next;  
    }
    public void delend(int n)
    {
     Node temp = head;
     Node prev = null;
     for(int i=1;i<n;i++)
     {
      prev=temp;  
      temp=temp.next;
     }
     prev.next=null;   
    }
    public void max()
    {
        Node temp = head;
        int b = 0;
        while(b<temp.data)
        {  
          b=temp.data;   
          temp = temp.next;
          if(temp==null){
           break; 
          }
        } 
        System.out.println("The maximum value is :"+b );
    }
    public void min()
    {
        Node temp = head;
        int b = temp.data;
        while(b>=temp.data)
        {  
          b=temp.data;   
          temp = temp.next;
          if(temp==null){
           break; 
          }
        } 
        System.out.println("The minimum value is :"+b );
    }
    public void reverse()
    {
      Node prev = null;
      Node current = head;
      Node next = current.next;
      while(current!=null)
      {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
      }  
      head=prev;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        linlis list = new linlis();
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        System.out.println("Enter  values");
        for(int i=0;i<n;i++)
        {
            int val = s.nextInt();
            list.insertend(val);
        }
        list.display();
        list.delend(n);
        list.display();
        System.out.println("Enter the node to add at the begin :");
        int val1= s.nextInt();
        list.insertbegin(val1);
        System.out.println("Enter the position and node to enter:");
        int p = s.nextInt();
        int val3 = s.nextInt();
        list.insertpos(p, val3);
        list.display();
        System.out.println("Enter the value to search :");
        int val2=s.nextInt();
        list.display();
        list.search(val2);
        list.max();
        list.min();
        list.reverse();
        list.display();
        list.delbegin();
        System.out.print("Enter the index to delete: ");
        int ind = s.nextInt();
        list.delpos(ind);
        list.display();
        s.close();
    }
   }