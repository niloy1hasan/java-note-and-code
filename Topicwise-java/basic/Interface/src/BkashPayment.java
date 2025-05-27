public class BkashPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Bkash");
    }
}
