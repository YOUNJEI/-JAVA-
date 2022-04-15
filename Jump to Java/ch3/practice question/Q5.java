public class Q5
{
	public static void main(String[] args)
	{
		String a = new String("a:b:c:d");
		StringBuilder sb = new StringBuilder();
		sb.append(a.replaceAll(":", "#"));

		String result = sb.toString();
		System.out.println(result);
	}
}
