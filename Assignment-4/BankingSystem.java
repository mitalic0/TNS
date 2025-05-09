// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid deposit/withdrawal amounts
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// BankAccount class representing a basic bank account
class BankAccount {
    private int accountNumber;
    private double balance;

    // Parameterized constructor to initialize account details
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit amount into the account
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw ₹" + amount);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: ₹" + amount);
    }

    // Method to display the current account balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}

// Main class to demonstrate banking operations with exception handling
public class BankingSystem {
    public static void main(String[] args) {
        // Creating a bank account with account number and initial balance
        BankAccount account = new BankAccount(123456, 5000.0);

        // Displaying initial balance
        account.displayBalance();

        // Attempting a deposit operation
        try {
            account.deposit(2000);
        } catch (InvalidAmountException e) {
            System.out.println("Error during deposit: " + e.getMessage());
        } finally {
            account.displayBalance(); // Always display updated balance
        }

        // Attempting a withdrawal operation
        try {
            account.withdraw(8000);  // This will trigger InsufficientFundsException
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        } finally {
            account.displayBalance(); // Always display updated balance
        }

        // Another withdrawal with valid amount
        try {
            account.withdraw(1000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        } finally {
            account.displayBalance(); // Final balance display
        }
    }
}
