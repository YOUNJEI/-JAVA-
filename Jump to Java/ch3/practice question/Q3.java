public class Q3
{
	public static void main(String[] args)
	{
		String ID = new String("881120-1068234");
		StringBuilder sb = new StringBuilder();
		sb.append("19");
		sb.append(ID.substring(0,6));
		sb.append(" ");
		sb.append(ID.substring(7,ID.length()));
		String result = sb.toString();

		System.out.println(result);
	}
}
