public class sample
{
	void varTest(int a)
	{
		a++;
		System.out.println("in the method varTest");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		int a = 1;
		sample s = new sample();
		System.out.println(a);
		s.varTest(a);
		System.out.println(a);
	}
}
