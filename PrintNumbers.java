
public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        System.out.println("Number thread started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted.");
            }
        }
        System.out.println("Number thread finished.");
    }
}
