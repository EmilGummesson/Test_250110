public class Account {

    private String accountNumber = "";
    private String accountName = "";
    private String password ="";
    private float balance = 0;
    private String accountType = "General Account";

    public Account(String accountName, String password) {

        java.util.Random random = new java.util.Random();

        this.accountNumber = String.valueOf(random.nextInt(10)) + String.valueOf(random.nextInt(10)) + String.valueOf(random.nextInt(10));
        this.accountName = accountName;
        this.password = password;

                //String.valueOf((char)(random.nextInt(26) + 'a')) + String.valueOf((char)(random.nextInt(26) + 'a')) + String.valueOf((char)(random.nextInt(26) + 'a'));
    }

    public String getAccountName(){
        return this.accountName;
    }

    public String getAccountType(){
        return this.accountType;
    }

}
