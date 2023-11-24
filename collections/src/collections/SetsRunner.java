package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsRunner {

	public static void main(String[] args) {
		List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(chars);

//		Set<Character> charhs = new HashSet<>();
//		charhs.add('A');
//		charhs.add('Z');
//		charhs.add('A');
//		charhs.add('B');
//		charhs.add('Z');
//		charhs.add('F');
//		System.out.println(charhs);

		Set<Character> charLhs = new LinkedHashSet<>();
		charLhs.add('A');
		charLhs.add('Z');
		charLhs.add('A');
		charLhs.add('B');
		charLhs.add('Z');
		charLhs.add('F');
		System.out.println("Linked Hash Set - " + charLhs);

		Set<Character> charTs = new TreeSet<>();
		charTs.add('A');
		charTs.add('Z');
		charTs.add('A');
		charTs.add('B');
		charTs.add('Z');
		charTs.add('F');
		System.out.println("Tree Set - " + charTs);
	}

}
