// q-5
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linked_list
{
	Node head;
	linked_list()     // Initialization of list
	{
		this.head=null;
	}
	void append_list(int data)
	{
		Node n1=new Node(data);	
        if (head==null)		
		{
			head=n1;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=n1;
	}
	void delete_from_end()
	{
		if(head==null)
		{
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node current=head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		current.next=null;
	}
	void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
}
class As35Test
{
	public static void main(String arg[])
	{
		linked_list l1=new linked_list();
		l1.append_list(10);
		l1.append_list(20);
		l1.append_list(30);
		l1.display();
		l1.delete_from_end();
		l1.display();
	}
}
	
		