class Animal
{
	static String c_name;
	String name;

	Animal(String s)
	{
		this.name = s;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setStaticName(String name)
	{
		c_name = name;
	}
	public void printStaticName()
	{
		System.out.println(c_name);
	}
}

public class sample
{
	public static void main(String[] args)
	{
		Animal cat = new Animal("cat");
		Animal dog = new Animal("dog");

		cat.printStaticName();
		dog.printStaticName();
		cat.setStaticName("포유류");
		cat.printStaticName();
		dog.printStaticName();
	}
}
