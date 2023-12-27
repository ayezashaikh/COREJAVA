package executorpackage;

import java.util.concurrent.*;

public class FutureObject {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<String> future=  executorService.schedule(() ->  "sample data", 1L, TimeUnit.MILLISECONDS);
        System.out.println(future.get());
        executorService.shutdown();
    }


}
