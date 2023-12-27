package callablevsRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

public class CallableAndRunnbale {
    public static void main(String[] args) throws Exception {
        Callable<Student> studentResult = () -> {
            return new Student();
        };
        System.out.println(studentResult);



    }


    Runnable runnable= ()-> System.out.println("Happy birth day");





}


class Student {
    int id = 10;
}

