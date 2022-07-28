package com;

public class CircularLinkedList {
	static class Node
	{
	    int data;
	    Node next;
	  
	    Node(int d)
	    {
	        data = d;
	        next = null;
	    }
	}
	Node head;
   CircularLinkedList(){
	  head=null;
   }
    void sortedInsert(Node new_node) {
    	Node current=head;
    	if(current==null) {
    		new_node.next=new_node;
    		head=new_node;
    	}
    	else if(current.data>=new_node.data) {
    		while(current.next!=head) {
    			current=current.next;
    		}
    		current.next=new_node;
    		new_node.next=head;
    		head=new_node;
    	}
    	else {
    		while(current.next!=head&&current.next.data<new_node.data) {
    			current=current.next;
    		}
    		new_node.next = current.next;
            current.next = new_node;
    	}
    }
    void printList()
    {
        if (head != null)
        {
            Node temp = head;
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }  while (temp != head);
        }
    }
	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		int arr[] = new int[] {3,5,2,11,7,6,9};
        Node temp1 = null;
        for (int i = 0; i < arr.length; i++)
        {
        	int x=arr[i];
           temp1 = new Node(x);
           clist.sortedInsert(temp1);
        }
          clist.printList();

	}
	
}
