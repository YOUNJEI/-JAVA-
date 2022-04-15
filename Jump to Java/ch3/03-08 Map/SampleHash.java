import java.util.HashMap;

public class SampleHash
{
	public static void main(String[] args)
	{
		HashMap<String, String>map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "yagu");

		System.out.println(map.get("people"));
		System.out.println(map.get("Java"));
		System.out.println(map.getOrDefault("Java", "디폴트"));
		
		System.out.println(map.remove("people"));
		
		if (map.containsKey("people"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.printf("map.size(): %d\n", map.size());
		System.out.println(map.get("baseball"));
		System.out.println(map.get("yagu"));

		map.put("YOUNJEI", "handsome");
		map.put("CODING", "fun");
		System.out.println(map.keySet());
	}
}
