/**
 *
 */
public class Account {
    private int id;
    private double balance;

    /**
     * @param id identifier of the account
     * @param balance currency in the account
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
