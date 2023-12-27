package newObjectcreation;


//how many we can create the question

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectCreationSteps {


    public static final String ABDUL = "abdul";

    public static void main(String[] args, Predicate<String> myFilrer1) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Csutomer myString = (Csutomer) Class.forName("newObjectcreation.Csutomer").newInstance();
        System.out.println(myString.getId());
        myString.clone();


        String string = "String";
        Class.forName(string).newInstance();
        System.out.println(ABDUL);


        Predicate<String> myFilrer = x -> x.equals("");
        Stream.of("abdul" , "azeem" , "Location").filter(myFilrer1).collect(Collectors.toList());
        sampleMethod();
    }

    private static void sampleMethod() {

        ArrayList location = new ArrayList<String>();
    }


}


class Csutomer {

    private int id=10;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}