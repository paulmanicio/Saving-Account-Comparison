public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);

        SavingsAccount.setAnnualInterestRate(0.05);

        System.out.println("Monthly balances for one year with 5% annual interest: ");
        System.out.println();
        System.out.println("Month  Account#    Balance   Account#     Balance");
        System.out.println("_________________________________________________");

        for(int month = 0; month < 12; month++) {
            if(month == 0) {
                System.out.printf("%-6d %-9d %9.2f    %-9d %9.2f%n", 0,
                saver1.getAccountNumber(),
                saver1.getBalance(),
                
                saver2.getAccountNumber(),
                saver2.getBalance());
            } else {
                saver1.addMonthlyInterest();
                saver2.addMonthlyInterest();

                System.out.printf("%-6d %-9d %9.2f    %-9d %9.2f%n", 
                month,
                saver1.getAccountNumber(),
                saver1.getBalance(),
                
                saver2.getAccountNumber(),
                saver2.getBalance());
            }
        }
        double total = saver1.getBalance() + saver2.getBalance();
        System.out.println();
        System.out.println("Final Balance (Accounts combined): $ " + String.format("%.2f", total));
    }
}
