abstract class Predator extends Animal
{
	abstract String getFood();

	void printFood()
	{
		System.out.printf("my food is %s\n", getFood());
	}

	static int LEG_COUNT = 4;

	static int speed()
	{
		return LEG_COUNT * 30;
	}
}

interface Barkable
{
	void bark();
}

class Animal
{
	String name;

	void setName(String name)
	{
		this.name = name;
	}
}

class Tiger extends Predator implements Barkable
{
	public String getFood()
	{
		return ("apple");
	}
	public void printFood()
	{
		System.out.printf("I'm tiger, my food is %s\n", "Steak");
	}
	public void bark()
	{
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable
{
	public String getFood()
	{
		return ("banana");
	}
	public void bark()
	{
		System.out.println("으르렁");
	}
}

class ZooKeeper
{
	void feed(Predator predator)
	{
		System.out.println("feed " + predator.getFood());
	}
	/*
	void feed(Tiger tiger)
	{
		System.out.println("feed apple");
	}
	void feed(Lion lion)
	{
		System.out.println("feed banana");
	}
	*/
}

class Bouncer
{
	void barkAnimal(Barkable animal)
	{
		animal.bark();
	}
}

public class Sample
{
	public static void main(String[] args)
	{
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		tiger.printFood();
		lion.printFood();
		System.out.println(Predator.speed());

		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
