interface Predator
{
	String bark();
}

abstract class Animal
{
	public String hello()
	{
		return ("hello");
	}
}

class Dog extends Animal
{
}

class Lion extends Animal implements Predator
{
	public String bark()
	{
		return "Bark bark!!";
	}
}

public class Q9
{
	public static void main(String[] args)
	{
		Animal a = new Lion();
		Lion b = new Lion();
		Predator c = new Lion();

		System.out.println(a.hello()); // O
		//System.out.println(a.bark()); // X
		System.out.println(b.hello()); // O
		System.out.println(b.bark()); // O
		//System.out.println(c.hello()); // X
		System.out.println(c.bark()); // O
	}
}
