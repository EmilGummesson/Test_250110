import java.util.ArrayList;

public class BankHandler {

    // The initialized scanner.
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
    // The current page the viewer is on.
    private static String currentPage = "start";
    // List of all accounts.
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    // Initialize and populate bank variables.
    public static void initialize() {
        // Main rendering loop.
        try {
            while (true) {
                renderPage();
            }
        }catch (Exception e) {System.exit(0);}
    }

    // Handle menu input and output
    public static void renderPage(){
        String input = "";

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        switch(currentPage) {
            case "start":
                writeMenu("Main Menu",new String[]{"Create Account","Sign in","Exit"});
                input = scanner.nextLine();

                switch(input){
                    case "1":
                        currentPage = "createAccount";
                        break;
                    case "2":
                        currentPage = "login";
                        break;
                    case "3":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Invalid input. Please try again");
                        pressEnterToContinue();
                        break;
                }
                break;
            case "createAccount":
                String name = "";
                String password = "";
                String accountType = "";
                Account newAccount = null;

                System.out.println("Enter name of Account:");
                name = scanner.nextLine();

                writeMenu("Create Account",new String[]{"Savings Account","Salary Account"});

                while (accountType.isEmpty()){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    accountType = scanner.nextLine();
                    switch(accountType){
                        case "1":
                            newAccount = new SavingsAccount(name,password);
                            accounts.add(newAccount);
                            break;
                        case "2":
                            newAccount = new SalaryAccount(name,password);
                            accounts.add(newAccount);
                            break;
                        default:
                            accountType="";
                            break;
                    }
                }

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\nAccount Created:\n\nName: " + newAccount.getAccountName() + "\nAccount Number: " + "TBA" + "\nAccount Type: " + newAccount.getAccountType() + "\n Password: " + "PASSWORD");
                pressEnterToContinue();
                currentPage = "start";
                break;
            case "login":
                String nameInput = "";
                String passwordInput = "";

                System.out.println("LOGIN:\n");
                System.out.println("Enter Account Name:");
                nameInput = scanner.nextLine();
                System.out.println("\nEnter Password:");
                passwordInput = scanner.nextLine();

                break;
            default:
                break;
                // code block
        }
    }






    public static void writeMenu(String header, String[] menuItems){
        System.out.println(header+"\n");
        for (int i = 0; i < menuItems.length; i++){
            System.out.println(i+1 + ". " + menuItems[i]);
        }
        System.out.println("\n");

    }


/*
    public static void writeLine(String string){
        System.out.println(string);
    }


    public static void menu(String string){
        System.out.println(string);
    }

*/
    private static void pressEnterToContinue()
    {
        System.out.println("\nPress Enter key to continue...");
        try
        {
            //System.in.read();
            scanner.nextLine();
        }
        catch(Exception e)
        {}
    }




}

