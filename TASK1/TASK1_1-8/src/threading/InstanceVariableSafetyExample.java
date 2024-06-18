package threading;

public class InstanceVariableSafetyExample {
	private int instanceCounter = 0;

	// Synchronized method to ensure thread-safe access to instance variable
	public synchronized void incrementInstanceCounter() {
		instanceCounter++;
		System.out.println(Thread.currentThread().getName() + " - Instance Counter: " + instanceCounter);
	}

	public static void main(String[] args) {
		InstanceVariableSafetyExample example = new InstanceVariableSafetyExample();

		// Creating multiple threads that modify the instance variable
		Thread thread1 = new Thread(example::incrementInstanceCounter, "Thread1");
		Thread thread2 = new Thread(example::incrementInstanceCounter, "Thread2");
		Thread thread3 = new Thread(example::incrementInstanceCounter, "Thread3");

		// Starting threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
