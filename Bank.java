public class Bank {
    // fields
    private BankAccount[] accounts;
   

    // constructors

    public Bank() {
        accounts = new BankAccount[4];
        accounts[0] =  new BankAccount("tim barron", 300.0);
        accounts[1] = new BankAccount("tim barron", 400.0);
        accounts[2] =  new BankAccount("tim barron", 500.0);
        accounts[3] =  new BankAccount("tim barron", 500.0);
    }

    public Bank(BankAccount[] premadeAccounts) {
        for(int i = 0; i < accounts.length; i++)
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
