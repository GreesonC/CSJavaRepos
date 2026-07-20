
public class TestClassQueue
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Cameron_Greeson Initial Test");
		MyLinkedQueue<String> stringQueue = new MyLinkedQueue();
		System.out.println("Test isEmpty(): " + stringQueue.isEmpty());
		stringQueue.enqueue("First Item");
		System.out.println("Test is Empty() after adding item: " + stringQueue.isEmpty());
		System.out.println("Test Dequeue: " + stringQueue.dequeue());
		System.out.println("Test is Empty() after dequeue item: " + stringQueue.isEmpty());
	}

}
