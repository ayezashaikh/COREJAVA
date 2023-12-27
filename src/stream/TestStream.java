package stream;


//find the duplicate element

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//find the duplicate element
class TestStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8, 4, 9, 134);
        Map<Integer, Long> map = Stream.of(1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8, 4, 9, 134).
                filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }

}

