package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Java Thread pool represents a group of worker threads 
 * that are waiting for the job and reused many times.
 * 
 * Methods->
 * newFixedThreadPool(int s) -> Fixed size thread pool create
 * newCachedThreadPool() -> creates a new thread pool that creates the new threads when needed
 * newSingleThreadExecutor() -> Creates a new Thread
 */

public class ThreadPool {

	//Runnable interface implementation
	static class Task implements Runnable {
		private final String taskName;

		public Task(String taskName) {
			this.taskName = taskName;
		}

		@Override
		public void run() {
			System.out.println("Executing " + taskName + " by " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// Using ExecutorService for thread pool
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// Creating tasks
		Task task1 = new Task("Task1");
		Task task2 = new Task("Task2");
		Task task3 = new Task("Task3");

		// Executing tasks using thread pool
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);

		// Shutting down the executor service
		executorService.shutdown();
	}
}
