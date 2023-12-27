package shortcut.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test implements Sample {




    int a;

    @Override
    public void updateDetail() {

    }

    @Override
    public void updateDetail1() {

    }

    @Override
    public void updateDetail2() {

    }

    @Override
    public void getDetailPerformance() {

    }

    public Test() {
    }

    public static void main(String[] args) {
        sampleMethjodName();


    }

    private static void sampleMethjodName() {


        List<String> numberAsString = Arrays.asList("1", "2", "3", "4");

        Runnable runnable = () -> System.out.println("");

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        IntStream.range(0, 10).forEach(x -> {
            Runnable runnable1 = () -> System.out.println("Task No " + x);
            Future<?> submit = executorService.submit(runnable1);
        });
        executorService.shutdown();
    }
}


class Employee {
    int id;
    String name;
    List<Technologies> technologies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Technologies> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technologies> technologies) {
        this.technologies = technologies;
    }

    public Employee(int id, String name, List<Technologies> technologies) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
    }
}

class Technologies {
    String name;

    public Technologies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Technologies{" +
                "name='" + name + '\'' +
                '}';
    }
}


interface Sample {
    public abstract void updateDetail();
    public final int i = 100;

    public abstract void updateDetail1();
    public abstract void updateDetail2();
    public abstract void getDetailPerformance();
}





