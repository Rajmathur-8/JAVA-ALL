package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer n) {
		return n * n;
	}

}

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48).stream().filter(n -> n % 2 == 0).map(n -> n * n)
				.forEach(e -> System.out.println(e));

		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());
	}
	// Stream<T> filter(Predicate<? super T> predicate);
	// boolean test(T t);
	// void forEach(Consumer<? super T> action);
	// void accept(T t);
	// R> Stream<R> map(Function<? super T, ? extends R> mapper);
	// public interface Function<T, R> {
	// R apply(T t);

}
