package threading;


//Each method has its own local variable counting
public class LocalVariableSafetyExample {

	// Thread-safe use of local variables
	public void processTask() {
		// Local variable
		int localCounter = 0;

		for (int i = 0; i < 5; i++) {
			localCounter++;
			System.out.println(Thread.currentThread().getName() + " - Local Counter: " + localCounter);
		}
	}

	public static void main(String[] args) {
		LocalVariableSafetyExample example = new LocalVariableSafetyExample();

		// Creating multiple threads that use local variables
		Thread thread1 = new Thread(example::processTask, "Thread1");
		Thread thread2 = new Thread(example::processTask, "Thread2");
		Thread thread3 = new Thread(example::processTask, "Thread3");

		// Starting threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
