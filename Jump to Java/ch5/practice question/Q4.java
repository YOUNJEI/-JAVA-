import java.util.ArrayList;
import java.util.Arrays;

class Calculator
{
	int value;

	Calculator()
	{
		this.value = 0;
	}
	
	void add(int val)
	{
		this.value += val;
	}

	int getValiue()
	{
		return (this.value);
	}

	int avg(int[] data)
	{
		int temp = 0;

		for (int i = 0; i < data.length; i++)
			temp += data[i];
		return (temp / data.length);
	}

	int avg(ArrayList<Integer> data)
	{
		Integer temp = 0;

		for (Integer n : data)
			temp += n;
		return (temp / data.size());
	}
}

public class Q4
{
	public static void main(String[] args)
	{
		int[] data = {1, 3, 5, 7, 9};
		Calculator cal = new Calculator();
		int result = cal.avg(data);
		System.out.println(result);

		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		Calculator cal2 = new Calculator();
		int result2 = cal.avg(data2);
		System.out.println(result2);
	}
}
