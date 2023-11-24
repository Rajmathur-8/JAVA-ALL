package functionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// numbers.stream().forEach(element -> System.out.println(element));

		int sum = numbers.stream().filter(element -> element % 2 != 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println(sum);

		// normalSum(numbers);
	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
	}
}
