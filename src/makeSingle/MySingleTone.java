package makeSingle;

public class MySingleTone {

    public static void main(String[] args) {


    }
}


class Product {

    private int productId;
    private String name;
    private String vendor;

    private static Product product = null;

    private Product() {

    }

    Product createNewProduct() {
        if (product == null) {
            product = new Product();
            return product;
        }
        return product;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This opertation is not allowed");
    }

    protected Object readResolve() {
        return createNewProduct();
    }


}
