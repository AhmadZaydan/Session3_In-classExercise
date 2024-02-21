//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCard credCard = new CreditCard("Ahmad", "BNI", "Ahmadblahblah012", 5000000, 2500000);
        System.out.println("Credit card info:\n" + credCard.toString());

        String customer = credCard.getCustomer();
        String bank = credCard.getBank();
        String account = credCard.getAccount();
        double limit = credCard.getLimit();
        double balance = credCard.getBalance();

        credCard.charge(200000);
        credCard.makePayment(150000);

        System.out.println("Credit card info:\n" + credCard.toString());
    }
}