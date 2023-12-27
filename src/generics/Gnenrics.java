package generics;

import java.util.ArrayList;
import java.util.List;

public class Gnenrics {

    public static void main(String[] args) {

        Sample<String,String> s1 = new Sample<>();
        Sample<Integer,Integer> s2 = new Sample<>();


        s1.getPrint("Abdul");

        s2.getPrint(200);

    }
}


class Sample<T, S> {

    T t;

    S s;

    void getPrint(T t) {
        System.out.println(t);
    }

}