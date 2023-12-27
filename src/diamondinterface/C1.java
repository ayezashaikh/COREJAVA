package diamondinterface;

public interface C1 extends G{


    @Override
    public default void showData(){
        System.out.println("From data C2");
    }

    public static void showName(){
        System.out.println("");
    }
}
