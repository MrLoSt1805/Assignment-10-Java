// Name: Daniel John Jacob
// PRN: 23070126027
// Batch: AIML A2

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // Creating thread objects 
	Thread t1 = new Thread(new PrintNumbers()); 
	Thread t2 = new Thread(new PrintAlphabets()); 

	// Starting threads 
	t1.start(); 
	t2.start(); 

	// Add this after t2.start(); 
	try { 
	    t1.join(); 
	    t2.join(); 
	} catch (InterruptedException e) { 
	    System.out.println("Thread interrupted: " + e.getMessage()); 
	} 

	System.out.println("Main thread finished."); 
    }
}
