import java.util.Arrays;
import java.util.HashSet;

public class SampleSet
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
		System.out.println(set);

		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

		HashSet<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);	// 교집합 수행
		System.out.println(intersection);

		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println(union);

		HashSet<Integer> substract = new HashSet<>(s1);
		substract.removeAll(s2);
		System.out.println(substract);

		HashSet<String> set2 = new HashSet<>();
		set2.add("Jump");
		set2.add("To");
		set2.add("Java");
		System.out.println(set2);

		HashSet<String> set3 = new HashSet<>();
		set3.addAll(Arrays.asList("To", "Java", "Jump"));
		System.out.println(set3);

		set3.remove("To");
		System.out.println(set3);
	}
}
