package collegeboard;
public class Producer extends Thread {
    private MessageBoard board;

    public Producer(MessageBoard board) {
        this.board = board;
    }

    @Override
    public void run() {
        String[] messages = {
            "Exam on Tuesday",
            "Holiday on Sunday",
            "Workshop on Wednesday"
        };

        for (String msg : messages) {
            board.put(msg);
            try {
                Thread.sleep(500); 
                } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        board.put("DONE");
    }
}
