class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double balance, double amount)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;
            int costPerItem = totalBill / items;
            System.out.println(costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        }

        try {
            String[] patients = {"Ravi", "Aman", "Priya"};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "abc";
            int amount = Integer.parseInt(input);
            System.out.println(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(5000, 7000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}