import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample2 {
    public static void main(String[] args)  {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(() -> doLongWork("Hugo"));
        executor.execute(() -> doLongWork("Paco"));
        executor.execute(() -> doLongWork("Luis"));
        executor.shutdown();

    }
    private static void doLongWork(String msg) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Running " + msg + ": " + i);
        }
    }
}
