import java.util.ArrayList;

public class Q1
{
	public static void main(String[] args)
	{
		Double temp = (double)0;

		ArrayList<Integer> score = new ArrayList<>();
		score.add(80);
		score.add(75);
		score.add(55);

		for (int i = 0; i < score.size(); i++)
			temp += score.get(i);
		temp /= score.size();
		System.out.println(temp);
	}
}
