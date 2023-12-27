package pack1interface;

public class Account implements HDFCAccount , SBIAccount{

    @Override
    public void getAmount() {

    }

    @Override
    public void getName() {
        HDFCAccount.super.getName();
    }


}
