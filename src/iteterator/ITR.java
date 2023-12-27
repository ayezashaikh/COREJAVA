package iteterator;

import java.util.*;

public class ITR {


    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Azeem");
        name.add("Arfat");
        name.add("Raheem");
        name.add("Location");
        name.add("Abdul");
        name.add("same");
        name.add("Sisi");
        name.add("Rajesh");

        Spliterator<String> stringSpliterator = name.spliterator();
        System.out.println("********************** Split Iterator********************");
        stringSpliterator.forEachRemaining(System.out::println);
        System.out.println("**********************END***************");
        name.spliterator().forEachRemaining(System.out::println);
        System.out.println("List Iterator");

        System.out.println("************* Backward Traversal ******************* ");
        ListIterator<String> stringListIterator = name.listIterator(name.size());
        while (stringListIterator.hasPrevious()) {
            System.out.println("stringListIterator.previous() = " + stringListIterator.previous());
        }
    }

}



