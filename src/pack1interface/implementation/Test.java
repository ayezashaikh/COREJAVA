package pack1interface.implementation;

public class Test {

    public static void main(String[] args) {

        MyInterface myInterface = new MyImplementation();

        MyInterface myInterface2 = new MyImplementation2();

        myInterface2.doSomething();

        myInterface.doSomething();
    }
}
