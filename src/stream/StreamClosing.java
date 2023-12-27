package stream;

import java.nio.file.FileVisitor;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClosing {


    public static void main(String[] args) {
   /*     String[] element = {"abdul", "Naeem", "Locartion", "best ", "somehting", "abdul", "Naeem", "Locartion", "best ", "somehting","abdul", "Naeem", "Locartion", "best ", "somehting", "abdul", "Naeem", "Locartion", "best ", "somehting"};


        List<String> elementList = Arrays.asList(element);

        elementList.stream().filter(x->x.equals("")).map(x->x).distinct().findAny().stream();
*/


        Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3).
                peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase).
                peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());


    }


}
