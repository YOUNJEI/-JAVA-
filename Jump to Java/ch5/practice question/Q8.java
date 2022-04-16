interface Predator
{
}

class Animal
{
}

class Dog extends Animal
{
}

class Lion extends Animal implements Predator
{
}

public class Q8
{
	public static void main(String[] args)
	{
		Animal a = new Animal(); // O
		Animal b = new Dog(); // O
		Animal c = new Lion(); // O
		// Dog d = new Animal(); // X
		Predator e = new Lion(); // O
	}
}
