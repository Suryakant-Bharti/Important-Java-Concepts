// Recursive Java program to search an element
// in linked list

// Node class
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

// Linked list class
class LinkedList
{
	Node head; //Head of list

	//Inserts a new node at the front of the list
	public void push(int new_data)
	{
		//Allocate new node and putting data
		Node new_node = new Node(new_data);

		//Make next of new node as head
		new_node.next = head;

		//Move the head to point to new Node
		head = new_node;
	}

	// Checks whether the value x is present
	// in linked list
	public boolean search(Node head, int x)
	{
		// Base case
		if (head == null)
			return false;

		// If key is present in current node,
		// return true
		if (head.data == x)
			return true;

		// Recur for remaining list
		return search(head.next, x);
	}

	// Driver function to test the above functions
	public static void main(String args[])
	{
		// Start with the empty list
		LinkedList llist = new LinkedList();

		/* Use push() to construct below list
		14->21->11->30->10 */
		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		if (llist.search(llist.head, 21))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}