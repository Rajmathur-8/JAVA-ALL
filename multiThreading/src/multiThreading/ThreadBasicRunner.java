package multiThreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 Started ");

		for (int i = 101; i <= 199; i++) {
		System.out.print(i + " ");
	}

	System.out.println("\nTask1 done! ");
}
}

class Task2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Task2 Started ");

		for (int i = 201; i <= 299; i++) {
		System.out.print(i + " ");
	}

	System.out.println("\nTask2 done! ");
}
}



public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		System.out.println("\nTask1 kicked off");
		Task1 task1 = new Task1();
		task1.start();

		System.out.println("\nTask2 kicked off");
		// task2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();

		task1.join();
		task2thread.join();

		System.out.println("\nTask3 kicked off");
		// task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 done! ");

	}

}
