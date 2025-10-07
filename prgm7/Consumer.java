package collegeboard;


public class Consumer extends Thread {
    private MessageBoard board;

    public Consumer(MessageBoard board) {
        this.board = board;
    }

    @Override
    public void run() {
        String msg;
        while (!(msg = board.get()).equals("DONE")) {
            System.out.println("Consumed: " + msg);
            try {
                Thread.sleep(500); // simulate display delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("No more messages to display.");
    }
}
