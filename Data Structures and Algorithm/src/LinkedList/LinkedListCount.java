package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}
class LinkedListCount{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
            CountNodes g = new CountNodes();
            System.out.println(g.getCount(head));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
}

class CountNodes{
    public int getCount(Node head){
        int c=0;                       // Initialize count
        while(head!=null){             // Keep moving to next node till it is null.
            head=head.next;
            c++;
        }
        return c;
    }
    
}