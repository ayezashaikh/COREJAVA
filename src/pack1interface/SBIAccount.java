package pack1interface;

public interface SBIAccount {
    public abstract void getAmount();

    public default  void  getName(){
        System.out.println("getName from HDFCAccount");
    }
}
