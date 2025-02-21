package threadEx;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.concurrent.*;

class CallableEx implements Callable<String>{

    public String call() throws Exception{
        System.out.println("thread created");
        Thread.sleep(1000);
        return "SUCCESS";
    }
}
public class callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> Task = new CallableEx();
        Future<String> future = executorService.submit(Task);
        String result =  future.get();

        System.out.println("result : " +result);

        executorService.shutdown();
    }
}
