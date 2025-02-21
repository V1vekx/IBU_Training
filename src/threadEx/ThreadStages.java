package threadEx;

class Stages implements Runnable{

    public void run(){
        System.out.println("Thread in runnable state");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Thread in runnable state after timed waiting");
        }

    }
}
public class ThreadStages {

    public static void main(String[] args) {
        Stages stages = new Stages();
        Thread thread1 = new Thread(stages);
        System.out.println("thread in new state");
        thread1.start();

        try {
            thread1.join();
            System.out.println("Thread in waiting stage");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Thread Terminated");

    }
}
