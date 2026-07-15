
public class MyLinkedQueue<T> implements QueueInterface<T>
{
	private Node firstNode;
	private Node lastNode;

	public MyLinkedQueue()
	{
		firstNode = null;
		lastNode = null;
	}

	/**
	 * Adds a new entry to the back of this queue.
	 * 
	 * @param newEntry An object to be added.
	 */
	public void enqueue(T newEntry)
	{
		Node newNode = new Node(newEntry);
		if (isEmpty())
		{
			firstNode = newNode;
			lastNode = newNode;
		} else
		{

		}
	}

	/**
	 * Removes and returns the entry at the front of this queue.
	 * 
	 * @return The object at the front of the queue.
	 * @throws EmptyQueueException if the queue is empty before the operation.
	 */
	public T dequeue()
	{
		return null;
	}

	/**
	 * Retrieves the entry at the front of this queue.
	 * 
	 * @return The object at the front of the queue.
	 * @throws EmptyQueueException if the queue is empty.
	 */
	public T getFront()
	{
		return null;
	}

	/**
	 * Detects whether this queue is empty.
	 * 
	 * @return True if the queue is empty, or false otherwise.
	 */
	public boolean isEmpty()
	{
		boolean isItEmpty = false;

		if (firstNode == null && lastNode == null)
		{
			isItEmpty = true;
		}

		return isItEmpty;
	}

	/** Removes all entries from this queue. */
	public void clear()
	{

	}

	private class Node
	{
		private T data; // Entry in list
		private Node next; // Link to next node

		private Node(T dataPortion)
		{
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
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
