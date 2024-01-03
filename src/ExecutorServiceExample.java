import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new ThreadExample("Hugo"));
        executor.execute(new ThreadExample("Paco"));
        executor.execute(new ThreadExample("Luis"));
        executor.shutdown();

        //Executor service: Es una interfaz de java que nos permite gestionar hilos de manera mas eficiente
        //Y proporciona un entorno mas controlado para ejecutar tareas en comparacion con la creacion manual de hilos
    }
}
