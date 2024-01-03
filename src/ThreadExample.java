public class ThreadExample implements Runnable{
    private String name;
    public ThreadExample(String name){
        this.name= name;

    }
    @Override
    public void run() {
    for (int i = 1; i <= 10; i++){
        System.out.println("Running: " + this.name + ": " + i);
    }
    }
}
