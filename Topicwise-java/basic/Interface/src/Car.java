public class Car implements Vehicle {
   private int gear;
   private int speed;

    public Car(){
        gear = 0;
        speed = 0;
        System.out.println("Car Starting...");
    }

    @Override
    public void changeGear(int gearNumber) {
        gear = gearNumber;
        System.out.println("Gear changed!");
        System.out.println("Current Gear " + gearNumber);
    }

    @Override
    public void speedUp(int speedIncrement) {
        if(speed+speedIncrement<=120){
            speed += speedIncrement;
            System.out.println("Current speed: " + speed);
        } else {
            System.out.println("Reached on max speed");
        }
    }

    @Override
    public void applyBrakes(int speedDecrement) {
        if(speed - speedDecrement >= 0){
            speed -= speedDecrement;
            System.out.println("Current speed: " + speed);
        }
        else{
            speed = 0;
        }
    }
}
