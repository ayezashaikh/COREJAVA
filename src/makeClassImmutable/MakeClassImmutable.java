package makeClassImmutable;

import java.util.*;

public class MakeClassImmutable {

    public static void main(String[] args) {
        List lo = new ArrayList<>();
        lo.add("Not Okay");
        Product product = new Product(10, "xyz", "vendor", lo);
        Product product2 = new Product(10, "xyz", "vendor", new ArrayList<>(product.getInformation()));

        product2.getInformation().remove(0);
        product2.getInformation().add("abdul azeem");

        System.out.println("product.getInformation()" + product.getInformation());
        System.out.println("product2.getInformation()" + product2.getInformation());

        List<String> lo1 = new ArrayList<>(200);


        System.out.println(lo1);
    }
}


final class Product {
    final private int id;
    final private String name;
    final private String vendor;
    private final List<String> information;

    public Product(int id, String name, String vendor, List<String> information) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public List<String> getInformation() {
        List<String> list = new ArrayList<>(information);
        return information;
    }
}


final class vendor {
    private final String location;
    private final String address;
    final private Map<String, String> subVendor;

    public vendor(String location, String address, Map<String, String> subVendor) {
        this.location = location;
        this.address = address;
        this.subVendor = subVendor;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, String> getSubVendor() {
        return new HashMap<>(subVendor);
    }
}


final class Address {

    private final String countryCode;
    private final String stateCode;
    private final String districtCode;
    private final String areaCode;

    private final Set<String> names;

    public Address(String countryCode, String stateCode, String districtCode, String areaCode , Set<String> names) {
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.districtCode = districtCode;
        this.areaCode = areaCode;
        this.names=names;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public String getAreaCode() {
        return areaCode;
    }
}


//make the class as final
//make all field as private and final
//dont give setter
//for the refernce type , retuern deep object
// initialize all of the fields via constructor



