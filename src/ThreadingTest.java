import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadingTest {


    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);


        Runnable runnable  =() -> System.out.println();
        executorService.execute(runnable);

        executorService.shutdown();

        executorService.isTerminated();

        Future<?> submit = executorService.submit(runnable);


        submit.isCancelled();




    }
}
