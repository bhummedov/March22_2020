package March22_2020;

public class CarLoan extends Loan {
    int APR;
    int creditScore;

    public CarLoan(int totalAmount, int accountNumber, String accountName, int balance, double interestRate, int numberOfPayment, int loanAmount, int APR, int creditScore) {
        super(totalAmount, accountNumber, accountName, balance, interestRate, numberOfPayment, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;
    }

    public double calculateMonthlyPayment(){
        return super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);
    }
    public void calculateTotalPayment(){
        double result= super.totalAmount*super.interestRate;

    }
}
