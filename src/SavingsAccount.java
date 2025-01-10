public class SavingsAccount extends Account{
    private String accountType = "Savings Account";

    public SavingsAccount(String accountName, String password){
        super(accountName,password);
        this.accountType = "Savings Account";
    }
}
