public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);

        SavingsAccount.setAnnualInterestRate(0.05);

        System.out.println("Monthly balances for one year with 5% annual interest: ");
        System.out.println();
        System.out.println("Month   Account#   Balance   Account#   Balance");
        System.out.println("_______________________________________________");
    }
}
