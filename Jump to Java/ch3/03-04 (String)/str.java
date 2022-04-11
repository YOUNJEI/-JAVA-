public class str
{
	public static void main(String[] args)
	{
		System.out.println(String.format("I eat %d apples.", 3));
		String str = "Hello Java";
		System.out.println(str.substring(2, 4));

		String str2 = new String("Hello,Hi Kook");
		String[] result = str2.split(",| ");
		System.out.println("split test");
		for (int i = 0; i < 3; i ++)
			System.out.println(result[i]);
	}
}
