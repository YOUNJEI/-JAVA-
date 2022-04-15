import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Final
{
	public static void main(String[] args)
	{
		final int n = 123;
		// n = 456; compile error

		final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
		a.add("c");	// 가능
		// a = new ArrayList<>(Arrays.asList("c", "d"));
		// 재할당 불가

		final List<String> lst = List.of("a", "b");
		// a.add("c"); error
	}
}
