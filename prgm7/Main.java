package collegeboard;

public class Main {
    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();

        Producer producer = new Producer(board);
        Consumer consumer = new Consumer(board);

        producer.start();
        consumer.start();
    }
}
