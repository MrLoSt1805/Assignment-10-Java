
public class PrintAlphabets implements Runnable {
    @Override
    public void run() {
        System.out.println("Alphabet thread started.");
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Alphabet: " + c);
            try {
                Thread.sleep(500); // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println("Alphabet thread interrupted.");
            }
        }
        System.out.println("Alphabet thread finished.");
    }
}
