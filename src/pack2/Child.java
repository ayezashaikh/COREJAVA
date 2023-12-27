package pack2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {
    public int i  =20;

    public List showData() throws RuntimeException{
        System.out.println("Child showData");
        return null;
    }

    public void showData(int i) {
        System.out.println("Child showData");
    }

    public void showData(int i, String name) {
        System.out.println("Child showData");
    }

    public static void main(String[] args)  {
        Parent parent = new Child();
       // parent.showData();
        System.out.println(parent.i);
    }
}
