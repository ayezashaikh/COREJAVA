package diamondinterface;
public class CClass implements C1, C2{

    @Override
    synchronized public void showData() {
        C2.super.showData();
    }

    public static void main(String[] args) {
        CClass cClass = new CClass();
        G.showName();
        C1.showName();
    }
}

