package enumtets;

public class TestEnum {
    public static void main(String[] args) {


    }
}


enum Order {

    ORDER_ACCEPTED(100,200);

    int id;
    int discount;

    Order(int id, int discount) {
        this.id = id;
        this.discount = discount;
    }

}