package designpatterns.proxy;

public class ATM implements  Account {
    @Override
    public void withdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
