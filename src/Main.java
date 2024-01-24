import java.util.*;

public class Main {
    public static double interestRate = 0.5;
    public static Scanner scan = new Scanner(System.in);
    public static Scanner vars = new Scanner(System.in);
    public static ArrayList<String> accounts = new ArrayList<String>();
    public static ArrayList<Double> balances = new ArrayList<Double>();

    public static void main(String[] args) {
        boolean run = false;
        while (!run) {
            System.out.print("LLBankTerm > ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("create")) {
                System.out.print("Account Name: ");
                create(vars.nextLine());
            } else if (command.equalsIgnoreCase("interest")) {
                System.out.print("New Interest Rate: ");
                interest(vars.nextInt());
            } else if (command.equalsIgnoreCase("deposit")) {
                System.out.print("Account Name: ");
                String holder = vars.nextLine();
                System.out.print("Amount to Deposit: ");
                double value = vars.nextDouble();
                deposit(holder, value);
            } else if (command.equalsIgnoreCase("withdraw")) {
                run = true;
            }
        }
    }
    public static void create(String accountName) {
        if (balances.size() == 30) {
            System.out.println("Error in Account Creation! Max Accounts!");
        } else if (accounts.contains(accountName)) {
            System.out.println("Error in Account Creation! Account " + accountName + " already exists!");
        } else {
            accounts.add(accountName);
            balances.add(0.0);
        }
    }
    public static void interest(int rate) {
        interestRate += 3;
    }
    public static void deposit(String holder, double amount) {
        boolean containsH = false;
        try {
            containsH = accounts.contains(holder);
        }
        catch(Exception e) {
            containsH = false;
            System.out.println("Account with name " + holder + " does not exist!");
        }
        if (containsH) {
            balances.set(accounts.indexOf(holder), balances.get(accounts.indexOf(holder)) + amount);
        }
    }
}