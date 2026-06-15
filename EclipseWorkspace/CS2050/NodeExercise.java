/**
 * Cameron_Greeson_NodeExercise
 */
public class NodeExercise
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		Node<String> apple = new Node<>("Apple");
		Node<String> banana = new Node<>("Banana");
		Node<String> cherry = new Node<>("Cherry");

		apple.setNextNode(banana);
		banana.setNextNode(cherry);

		Node<String> current = apple;
		while (current != null)
		{
			System.out.println(current.getData());
			current = current.getNextNode();
		}

		// Task 3: Traverse the chain and display the data of each node.
		// Task 4: Update the data in node2 from "Banana" to "Blueberry".
		// Task 5: Traverse the chain again to display the updated list.
		// Task 6: Insert a new node "Catnip" between node2 and node3.
		// Task 7: Traverse the chain again to display the last node in the chain.
	}
}
