/**
 * 
 */
public class InClassExercise01
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Dog dog = new Dog("Gryffin");

		System.out.println(dog.getName() + " says ");
		dog.speak();

		Cat cat = new Cat("Luna");

		System.out.println(cat.getName() + " says ");
		cat.speak();
	}

}