package shortcut;

public class NewShortCutPractice {


    public static void main(String[] args) {


        String locationDetail = "location and perfromance";
        Runnable runnable = () -> System.out.println(locationDetail);


        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append(1);

    }
}


class Student {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


class Device {
    private int id;
    private String name;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class SampleImpe implements Sampel {
    @Override
    public void getDetail() {
        System.out.println("print ok");
    }
}


class SampleImle2 implements Sampel {
    @Override
    public void getDetail() {
        System.out.println("print ok sample 2");
    }

}
