package collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionsEx {


    public static void main(String[] args) {
        HashMap hashMap = new HashMap<String, String>();
        Map<String, String> stringStringMap = Collections.singletonMap("hashMap", "sample");
        List<String> abdul = new ArrayList<>(Arrays.asList("abdul", "abdul2"));
        List<String> sample = new ArrayList<>(Arrays.asList("abdul", "abdul2"));
        Collections.copy(abdul, sample);
//        System.out.println(abdul);


        List<String> sample1 = List.of("sample", "sampple2", "sample3");
        List<String> myList = new ArrayList<>(List.of("sample", "sampple2", "11213", "24332422", "dsffs", "zzzzzz"));
        //    System.out.println(Collections.frequency(myList, "sample"));


//        List<String> strings = Collections.synchronizedList(myList);
//        Collections.sort(myList);
//        System.out.println(myList);
//        Deque<String> stringDeque = new LinkedBlockingDeque<>();
//        Queue<String> strings = Collections.asLifoQueue(stringDeque);
//        int i = Collections.binarySearch(myList, "");
//        Collection<String> strings1 = Collections.checkedCollection(myList, String.class);
//        strings1.stream().toList();


        Set emptySet = Collections.EMPTY_SET;

        Map emptyMap = Collections.EMPTY_MAP;

        Set emptySet1 = Collections.EMPTY_SET;

        List emptyList = Collections.EMPTY_LIST;


/*
        boolean disjoint = Collections.disjoint(myList, myList);

        System.out.println(disjoint);
*/


/*
        String max = Collections.max(myList);
        System.out.println(max);
*/

        Collections.reverse(myList);
        System.out.println(myList);
        Collections.reverse(myList);
        System.out.println(myList);



    }
}
