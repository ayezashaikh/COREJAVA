package forkjoinpool;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolWork {
    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(10);
        linkedList.addLast(10);
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.remove(Integer.valueOf(10));
        linkedList.remove(null);
        System.out.println(linkedList);
        linkedList.remove(null);
        System.out.println(linkedList);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.lower("");
        treeSet.ceiling("");


    }

}
