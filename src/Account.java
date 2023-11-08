public class Account {
    private final long accountNumber;
    private double balance;
    private final int dateOfBirth;

    public Account(long accountNumber, double initialBalance, int dateOfBirth){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.dateOfBirth = dateOfBirth;
    }
    public long getAccount(){
        return accountNumber;
    }
    public boolean getAccountNumber(int providedBirthDate){
        return providedBirthDate == dateOfBirth;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0)
            balance+= amount;
    }
    public void withdraw(double amount){
        if(amount <= balance && amount > 0)
            balance-=amount;
    }

}
