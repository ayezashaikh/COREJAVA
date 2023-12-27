package comaprision;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCompare {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(2, "b", "IND"),
                new Product(1, "a", "USA"),
                new Product(4, "c", "FRENCH"),
                new Product(3, "c", "JPN")
        );

        List sortedList = products.stream().sorted(Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
      //  System.out.println(sortedList);


        String   name= "c";

        System.out.println(name.compareTo("b"));

    }
}


class Student implements Comparable {
    private int id;
    private String name;
    private String address;

    public int compareTo(Object object) {
        Student student = (Student) object;
        if (student.id == id) {
            return 0;
        }
        if (student.id > id) {
            return 1;
        }
        return -1;
    }
}


class Product implements Comparable<Product> {
    private int id;
    private String name;
    private String address;


    public Product(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.getId());
    }
}


class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getId(), p2.getId());
    }
}



