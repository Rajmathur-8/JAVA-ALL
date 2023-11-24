package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Bat", "Cat", "Dog");

		printBasicFP(list);

	}

	private static void printBasicFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}

	}

}
