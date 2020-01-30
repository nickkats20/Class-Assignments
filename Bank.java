public class Bank {
    // fields
    private BankAccount[] accounts;

    // constructors

    public Bank() {
        accounts = new BankAccount[4];
        accounts[0] = new BankAccount("tim barron", 300.0);
        accounts[1] = new BankAccount("tim barron", 400.0);
        accounts[2] = new BankAccount("tim barron", 500.0);
        accounts[3] = new BankAccount("tim barron", 500.0);
    }
    

    public Bank(BankAccount[] premadeAccounts) {
        this.accounts = premadeAccounts;
    }

    public Bank(BankAccount[] premadeAccounts, double startingAmountForAllAccounts) {
        this.accounts = premadeAccounts;
        for (BankAccount b : this.accounts) b.deposit(startingAmountForAllAccounts);
    }

    // methods

    public double calcTotalFunds() {
        double totalFunds = 0;
        for (BankAccount b : this.accounts) totalFunds += b.getBalance();
        return totalFunds;
    }

    public void chargeFees(double fee) {
        for(BankAccount b : this.accounts) b.withdraw(fee);
    }

    public void addInterest(double interestRate) {
        for(BankAccount b : this.accounts) b.deposit(b.getBalance() * interestRate);
    }

    public void printAllReports() {
       for(BankAccount b : this.accounts) b.printInfo();
    }
}
