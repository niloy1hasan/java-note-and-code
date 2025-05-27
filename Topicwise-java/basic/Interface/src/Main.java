public class Main{
    public static void main(String[] args){
        BkashPayment bkash = new BkashPayment();
        RocketPayment rocket = new RocketPayment();
        bkash.pay(500);
        rocket.pay(800);
        System.out.println();

        Car car = new Car();
        car.changeGear(2);
        car.speedUp(10);
        car.speedUp(20);
        car.applyBrakes(20);
        car.applyBrakes(20);

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.applyBrakes(10);
        bike.speedUp(40);
        bike.speedUp(50);
        bike.applyBrakes(20);
        bike.speedUp(80);
        bike.speedUp(30);
        bike.applyBrakes(10);
        System.out.println("\n");
        SmartPhone phone = new SmartPhone();
        phone.turnON();
        phone.showBatteryStatus(50);
    }
}