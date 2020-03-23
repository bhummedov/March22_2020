package March22_2020;

public class BankTest {
    public static void main(String[] args) {
        BankClass myBank = new BankClass(11111, "Chase", 500);
        Loan myLoan = new Loan(2000, 2121212, "Chase", 500, 8.1, 1233432, 200);
        Loan myCarLoan = new CarLoan(2000, 111111, "Chase", 5000,8.1, 12, 200, 12, 20);
        System.out.println(myCarLoan.calculateMonthlyPayment());

    }
    }
