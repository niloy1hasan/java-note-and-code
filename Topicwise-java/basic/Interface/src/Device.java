public interface Device {
    int maxBattery = 100;

    void turnON();

    default void showBatteryStatus(int battery){
        System.out.println("Battery: " + battery + "%");
        checkLowBattery(battery);
    }

    static void deviceInfo(){
        System.out.println("this device Support turn on/off feature");
    }

    private void checkLowBattery(int battery){
        if(battery<20){
            System.out.println("Warning: Battery Low!");
        }
    }
}
