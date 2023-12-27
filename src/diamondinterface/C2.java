package diamondinterface;

public interface C2 extends G{

    @Override
    public default void showData(){

        System.out.println("From data C2");
    }



}
