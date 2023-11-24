package multiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<Callabletask> tasks = List.of(new Callabletask("Raj Mathur"), new Callabletask("Gaurav"),
				new Callabletask("Sumit"));

		String result = executorService.invokeAny(tasks);

		System.out.println(result);


		executorService.shutdown();
	}

}
