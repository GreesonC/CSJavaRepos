public class LinkedQueue<T>
{
	private Node<T> front;
	private Node<T> rear;
	// TO COMPLETE: define two pointers front and rear

	public void enqueue(T item)
	{
		// TO COMPLETE
		Node<T> newNode = new Node<>(item);

		if (isEmpty())
		{
			front = newNode;
			rear = newNode;
		} else
		{
			rear.setNextNode(newNode);
			rear = newNode;
		}
	}

	public T dequeue()
	{
		// TO COMPLETE
		if (isEmpty())
		{
			return null;
		}

		T frontItem = front.getData();
		front = front.getNextNode();

		if (front == null)
		{
			rear = null;
		}

		return frontItem;
	}

	public T peek()
	{
		// TO COMPLETE
		return null;// Note: this is just a dummy return value.
	}

	public boolean isEmpty()
	{
		// TO COMPLETE
		return false;// Note: this is just a dummy return value.
	}

	public void printQueue()
	{

	}

	private class Node<T>
	{
		private T data; // Entry in queue
		private Node next; // Link to next node

		private Node(T dataPortion)
		{
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node linkPortion)
		{
			data = dataPortion;
			next = linkPortion;
		} // end constructor

		private T getData()
		{
			return data;
		} // end getData

		private void setData(T newData)
		{
			data = newData;
		} // end setData

		private Node getNextNode()
		{
			return next;
		} // end getNextNode

		private void setNextNode(Node nextNode)
		{
			next = nextNode;
		} // end setNextNode
	} // end Node
}
