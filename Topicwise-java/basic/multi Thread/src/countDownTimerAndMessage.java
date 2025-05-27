public class countDownTimerAndMessage {
    public static void main(String[] args) {
        Thread countdown = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i > 0; i--) {
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Countdown: " + i);
                }
            }
        });

        Thread message = new Thread(new Runnable() {
            @Override
            public void run() {
                while (countdown.isAlive()){
                    System.out.println("waiting...");
                    try{
                        Thread.sleep(500);
                    } catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        countdown.start();
        message.start();

    }
}
