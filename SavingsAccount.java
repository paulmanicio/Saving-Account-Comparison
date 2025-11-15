public class SavingsAccount {
    private static double annualInterestRate;

    private final int ACCOUNT_NUMBER;

    private double balance;

    public SavingsAccount(int accountNumber, double initialBalance) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.balance = startingBalance;
    }

    public int getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public double getBalance() {
        return balance;
    }
}
