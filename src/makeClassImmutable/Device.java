package makeClassImmutable;


import java.util.ArrayList;
import java.util.List;

//make it immutable
public final class Device {

    private final int id;
    private final String name;
    private final String type;

    private final List<String> vendors;

    public Device(int id, String name, String type, List<String> vendors) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.vendors = vendors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getVendors() {
        return new ArrayList<>(this.vendors);
    }
}
