public class sample2
{
	int a;

	void varTest()
	{
		this.a++;
	}
	void varTest(sample2 s)
	{
		s.a++;
	}
	public static void main(String[] args)
	{
		sample2 s = new sample2();
		s.a = 1;

		s.varTest(s);
		System.out.println(s.a);
		s.varTest();
		System.out.println(s.a);
	}
}
