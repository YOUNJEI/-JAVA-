interface Predator
{
	String getFood();

	default void printFood()
	{
		System.out.printf("my food is %s\n", getFood());
	}

	int LEG_COUNT = 4;

	static int speed()
	{
		return LEG_COUNT * 30;
	}
}

class Animal
{
	String name;

	void setName(String name)
	{
		this.name = name;
	}
}

class Tiger extends Animal implements Predator
{
	public String getFood()
	{
		return ("apple");
	}
	public void printFood()
	{
		System.out.printf("I'm tiger, my food is %s\n", "Steak");
	}
}

class Lion extends Animal implements Predator
{
	public String getFood()
	{
		return ("banana");
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
	}
}
