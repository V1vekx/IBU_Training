package threadEx;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i =100; i<110 ;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadBasics {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();

        thread1.start();

        MyThread2 thread2 = new MyThread2();
        Thread thread = new Thread(thread2);

        thread.start();
    }
}












