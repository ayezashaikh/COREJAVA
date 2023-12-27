package collection;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {

/*
        work on  link list
*/
        List<String> mylist = new ArrayList<>();
        mylist.add("name");
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        mylist.add("location" + System.currentTimeMillis());
        System.out.println(mylist);
        List<String> synch = Collections.synchronizedList(mylist);
        synch.add("11");





    }
}