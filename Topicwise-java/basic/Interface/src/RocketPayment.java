public class RocketPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Rocket");
    }
}
