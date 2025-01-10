public class SalaryAccount extends Account {
    private String accountType = "Salary Account";

    public SalaryAccount(String accountName, String password){
        super(accountName,password);
        this.accountType = "Salary Account";
    }
}
