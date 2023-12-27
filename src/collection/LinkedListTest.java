package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> sampleLinkedList = new LinkedList<>();
        sampleLinkedList.add("abdul");
        sampleLinkedList.addLast("");
        sampleLinkedList.addFirst("abdul1");
        sampleLinkedList.poll();
        sampleLinkedList.peek();
        sampleLinkedList.remove("");
        sampleLinkedList.removeFirst();
        sampleLinkedList.removeFirstOccurrence("");
        sampleLinkedList.offer("");
        sampleLinkedList.offerFirst("");
        sampleLinkedList.offerLast("");
        ArrayList<String> sampleArrayList = new ArrayList<>();

        /*
                Vector<String> sampleVector = new Vector<>();
        */


        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("");
        copyOnWriteArrayList.remove("");








    }
}
