package JavaVersionFeature.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {


//        String multiLineString = "     Hello Abdul Azeem     \n  Please enter the user id password \n User Id or Password is wrong";
//        List<String> lines = multiLineString.lines().collect(Collectors.toList());
//
//        lines.stream().map(String::toUpperCase).map(String::strip).forEach(System.out::println);


        var name = "     azeem     ".stripLeading();

        System.out.println("name = " + "|" + name + "|");



    }

}
