package javaAray;

public class Arraypractice {
    public static void main(String[] args) {
        System.out.println(new Product());

    }
}

class Product {
    int id;

    String name;

    long fess;

    float percent;

    double score;
    boolean exampResult;

    public Product() {
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fess=" + fess +
                ", percent=" + percent +
                ", score=" + score +
                ", exampResult=" + exampResult +
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

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}