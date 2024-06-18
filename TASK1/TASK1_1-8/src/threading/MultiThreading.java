package threading;

/*
 * Multithreading is a process of executing multiple threads simultaneously.
 */

public class MultiThreading {
	// Volatile keyword -> make sure visibility of changes to variables across threads
	private static volatile int volatileCounter = 0;

	// Thread-safe increment method
	public static synchronized void incrementVolatileCounter() {
		volatileCounter++;
	}

	//Runnable interface implementation
	static class Task implements Runnable {
		private final String taskName;

		public Task(String taskName) {
			this.taskName = taskName;
		}

		@Override
		public void run() {
			System.out.println("Executing " + taskName + " by " + Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				incrementVolatileCounter();
				System.out.println(taskName + " - Counter: " + volatileCounter);
			}
		}
	}

	public static void main(String[] args) {
		// Creating threads
		Thread thread1 = new Thread(new Task("Task1"));
		Thread thread2 = new Thread(new Task("Task2"));
		Thread thread3 = new Thread(new Task("Task3"));

		// Starting threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
