package bank;

public class BankAccount {

    private Person owner;

    private double amount;

    private int id;

    public BankAccount(Person owner, double amount, int id) {
        this.owner = owner;
        this.amount = amount;
        this.id = id;
    }

    public BankAccount() {
    }
}
