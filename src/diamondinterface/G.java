package diamondinterface;

public interface G {

    public default void showData() {
        System.out.println("From G show Data");
    }

    public static void showName(){
        System.out.println("");
    }


}
