import java.util.Scanner;

// Custom checked exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class InvalidTransactionFormatException extends RuntimeException {
    public InvalidTransactionFormatException(String message) {
        super(message);
    }
}

// Account class
class Account {
    String accountId;
    double balance;

    Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (balance < amount) throw new InsufficientFundsException("Insufficient funds in " + accountId);
        balance -= amount;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pre-created accounts
        Account acc1 = new Account("A1001", 500.0);
        Account acc2 = new Account("A1002", 100.0);

        System.out.println("Enter number of transactions:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter transaction (format: <accountId>,<operation>,<amount>):");
            String t = sc.nextLine();

            try {
                String[] parts = t.split(",");
                if (parts.length != 3) throw new InvalidTransactionFormatException("Bad format: " + t);

                String id = parts[0].trim();
                String op = parts[1].trim().toUpperCase();
                double amt = Double.parseDouble(parts[2].trim());

                Account acc = null;
                if (id.equals("A1001")) acc = acc1;
                else if (id.equals("A1002")) acc = acc2;
                else {
                    System.out.println("No such account: " + id);
                    continue;
                }

                if (op.equals("DEPOSIT")) {
                    acc.deposit(amt);
                    System.out.println("Processed: " + id + " DEPOSIT " + amt + " -> " + acc.balance);
                } else if (op.equals("WITHDRAW")) {
                    acc.withdraw(amt);
                    System.out.println("Processed: " + id + " WITHDRAW " + amt + " -> " + acc.balance);
                } else {
                    throw new InvalidTransactionFormatException("Invalid operation: " + op);
                }

            } catch (InvalidTransactionFormatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number in transaction: " + t);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " in " + t);
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Final balances
        System.out.println("\nFinal balances:");
        System.out.println(acc1.accountId + ": " + acc1.balance);
        System.out.println(acc2.accountId + ": " + acc2.balance);

        sc.close();
    }
}

