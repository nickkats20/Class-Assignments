public class Bank {
    // fields
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;

    // constructors

    public Bank() {
        account1 = new BankAccount("tim barron", 300.0);
        account2 = new BankAccount(700.0);
        account3 = new BankAccount("joe bradley");
    }

    public Bank(BankAccount b1, BankAccount b2, BankAccount b3) {
        account1 = b1;
        account2 = b2;
        account3 = b3;
    }

    public Bank(double startingAmountForAllAccounts) {
        account1 = new BankAccount(startingAmountForAllAccounts);
        account2 = new BankAccount(startingAmountForAllAccounts);
        account3 = new BankAccount(startingAmountForAllAccounts);
    }

    // methods

    public double calcTotalFunds() {
        return account1.getBalance() + account2.getBalance() + account3.getBalance();
    }

    public void chargeFees(double fee) {
        account1.withdraw(fee);
        account2.withdraw(fee);
        account3.withdraw(fee);
    }

    public void addInterest() {
        account1.deposit(account1.getBalance() * 0.05);
        account2.deposit(account2.getBalance() * 0.05);
        account3.deposit(account3.getBalance() * 0.05);
    }

    public void printAllReports() {
        account1.printInfo();
        account2.printInfo();
        account3.printInfo();
    }

}
