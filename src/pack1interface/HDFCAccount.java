package pack1interface;

public interface HDFCAccount {
    public abstract void getAmount();

    public default  void  getName(){
        System.out.println("getName from HDFCAccount");
    }
}
