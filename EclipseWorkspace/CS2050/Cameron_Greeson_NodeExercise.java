/**
 * Cameron_Greeson_NodeExercise
 */
public class Cameron_Greeson_NodeExercise
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		Node<String> node1 = new Node<>("Apple");
		Node<String> node2 = new Node<>("Banana");
		Node<String> node3 = new Node<>("Cherry");

		node1.setNextNode(node2);
		node2.setNextNode(node3);

		System.out.println(node1.getNextNode().getNextNode().getData());
		Node<String> current = node1;
		while (current != null)
		{
			System.out.println(current.getData());
			current = current.getNextNode();

		}

		node2.setData("Blueberry");
		node2.getData();
		Node<String> current2 = node1;
		System.out.println("\n");
		while (current2 != null)
		{
			System.out.println(current2.getData());
			current2 = current2.getNextNode();
		}

		Node<String> catnip = new Node<>("Catnip");
		node1.setNextNode(node2);
		node2.setNextNode(catnip);
		catnip.setNextNode(node3);

		Node<String> current3 = node1;
		System.out.println("\n");
		while (current3 != null)
		{
			System.out.println(current3.getData());
			current3 = current3.getNextNode();
		}

	}
}
