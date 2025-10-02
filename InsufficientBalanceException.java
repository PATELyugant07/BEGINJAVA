class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Bank {
    double balance = 5000;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance to withdraw!");
        }
        balance -= amount;
        System.out.println("Withdraw successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank();
        try {
            account.withdraw(7000); // More than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
