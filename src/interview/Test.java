package interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

//    public static void main(String[] args) {
//        String token = "[[[{{{{}}}}]]]{}{}{}{}{}";
//        StringBuilder stringBuilder =  new StringBuilder(token);
//        token = token.replace("{}", "");
//
//
//        while (token.length() / 2 > 0) {
//            token = token.replaceAll("\\{}", "");
//            token = token.replaceAll("\\[]", "");
//        }
//
//        if (token.length() == 0) {
//            System.out.println("balanced tree");
//        } else {
//            System.out.println("un balanced tree");
//        }
//    }


    public static void main(String[] args) {

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("abdul");
        stringList.add("azeem");
        stringList.add("collection");
        stringList.add("sample");


        Iterator<String> stringIterator = stringList.descendingIterator();

        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

    }

}
