package threadEx;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class ExecutorClass implements Runnable {
    public void run() {
        System.out.println("current working thread" + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("task completed");
    }
}
public class ExecutorEx {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0 ;i<5 ;i++){

            System.out.println(executorService.submit(new ExecutorClass()));
    }


    }
}
