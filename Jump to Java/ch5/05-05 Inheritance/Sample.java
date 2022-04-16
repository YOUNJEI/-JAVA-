class Animal
{
	String name;

	void setName(String name)
	{
		this.name = name;
	}
}

class Dog extends Animal
{
	void sleep()
	{
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog
{
	void sleep()
	{
		System.out.println(this.name + "zzz in house");
	}
	void sleep(int hour)
	{
		System.out.println(this.name + "zzz in house for " + hour + " hours");
	}
}

public class Sample
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();

		// IS-A
		Animal dog2 = new Dog();	// Dog is an Animal
		// Dog dog = new Animal(); Animal is a not dog

		HouseDog houseDog = new HouseDog();
		houseDog.setName("Happy");
		houseDog.sleep();
		houseDog.sleep(3);
	}
}
