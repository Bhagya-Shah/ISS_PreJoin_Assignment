package threading;

// To prevent -> race conditions, deadlocks, and information inconsistency.

public class ThreadSafety {
	private int counter = 0;

	// Synchronized method
	public synchronized void incrementCounter() {
		counter++;
		System.out.println("Counter (method): " + counter);
	}

	// Synchronized block
	public void incrementCounterBlock() {
		synchronized (this) {
			counter++;
			System.out.println("Counter (block): " + counter);
		}
	}

	public static void main(String[] args) {
		ThreadSafety syncExample = new ThreadSafety();

		// Thread-safe operations using synchronized methods and blocks
		Thread thread1 = new Thread(() -> syncExample.incrementCounter());
		Thread thread2 = new Thread(() -> syncExample.incrementCounterBlock());

		thread1.start();
		thread2.start();
	}
}
