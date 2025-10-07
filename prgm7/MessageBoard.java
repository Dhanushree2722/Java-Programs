package collegeboard;

public class MessageBoard {
    private String message;
    private boolean hasMessage = false;

    
    public synchronized void put(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        hasMessage = true;
        System.out.println("Produced: " + msg);
        notify(); 
    }

    
    public synchronized String get() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasMessage = false;
        notify(); // notify producer
        return message;
    }
}
