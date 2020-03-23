package March22_2020;

public class BankClass {
    protected int accountNumber;
    protected String accountName;
    protected int balance;

    public BankClass(int accountNumber, String accountName, int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankClass{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int addMoney(int money) {
        return this.balance + money;
    }

    public int drawMoney(int money) {
        return this.balance - money;
    }

    public String changeName(String newName) {
        this.accountName = newName;
        return this.accountName;
    }
}

