public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public String getCustomer() {
        return this.customer;
    }

    public String getBank() {
        return this.bank;
    }

    public boolean charge(double price) {
        if (price > 0 && this.balance + price <= this.limit) {
            this.balance += price;
            System.out.println("Charge successful! Current balance: Rp" + this.balance);
            return true;
        } else {
            System.out.println("Charge failed! Invalid price or exceeding credit limit.");
            return false;
        }
    }

    public void makePayment(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Payment successful! Current balance: Rp" + this.balance);
        } else {
            System.out.println("Payment failed! Invalid payment amount or insufficient balance.");
        }
    }

    public String getAccount() {
        return this.account;
    }

    public int getLimit() {
        return this.limit;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        String result;
        result = "Customer: " + this.customer +
                "\nBank: " + this.bank +
                "\nAccount: " + this.account +
                "\nLimit: " + this.limit +
                "\nBalance: " + this.balance;
        return result;
    }

}
