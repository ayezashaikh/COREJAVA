package executorpackage;

import java.util.concurrent.*;

public class TestMultiThreading {


    public static void main(String[] args) throws InterruptedException {

        Executor executor = Executors.newFixedThreadPool(10);
        executor.execute(()-> System.out.println("ok"));

    }


//    public void scheduleTask(){
//        //Asynchronus execution
//        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        Future<String> future= executorService.schedule(()-> "Abdul".toUpperCase(),1L,TimeUnit.SECONDS);
//    }
}
