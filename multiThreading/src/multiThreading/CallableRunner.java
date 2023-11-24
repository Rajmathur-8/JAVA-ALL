package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Callabletask implements Callable<String> {
	private String name;

	public Callabletask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> welcomeFuture = executorService.submit(new Callabletask("Raj Mathur"));
		System.out.println("\n new callable Task(\" Raj Mathur \") Executed");

		String welcomeMessage = welcomeFuture.get();
		System.out.print(welcomeMessage);

		System.out.println("\nMain Completed");

		executorService.shutdown();
	}

}

