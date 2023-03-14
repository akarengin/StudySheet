package garbageCollector;

class Test {
	public static void main(String[] args) // A "main thread" gets introduced
	{
		Test t = new Test(); // A Test object gets created
		t.finalize(); // Finalize( ) method is called explicitly
		
		t = null; // Test object becomes eligible for garbage collection
		System.gc();  // A request is made to JVM for running garbage collector ; A "gc thread" gets
						// introduced
		System.out.println("End of main method");
		
	}

	public void finalize() // Test class finalize( ) method
	{
		System.out.println("Finalize method called");
	}
}
