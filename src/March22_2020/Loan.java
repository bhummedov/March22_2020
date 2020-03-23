package March22_2020;

public class Loan extends BankClass{
    double interestRate;
    int numberOfPayment;
    int loanAmount;
    int totalAmount;

    public Loan(int totalAmount,int accountNumber, String accountName, int balance, double interestRate, int numberOfPayment, int loanAmount) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.loanAmount = loanAmount;
        this.totalAmount=totalAmount;
    }
    public double calculateMonthlyPayment(){
        return loanAmount*interestRate/numberOfPayment;
    }
    public void calculateTotalPayment(){
        this.totalAmount= (int)(loanAmount*interestRate);

    }
}
