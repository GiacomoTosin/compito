import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;

    }

    public void run() {
        System.out.println("Starding: " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Completed: " + id);
    }
}

public class App {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        


    }

}
