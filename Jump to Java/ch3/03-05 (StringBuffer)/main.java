public class main
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("hello");
		sb2.append(" ");
		sb2.append("jump to java");
		String result2 = sb2.toString();
		System.out.println(result2);
	}
}
