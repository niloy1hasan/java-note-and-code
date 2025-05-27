public class Main{
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=10; i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for(int i=1; i<=10; i++){
            System.out.println("call " + i + " Is thread alive? " + thread.isAlive());
            if(i==5){
                try {
                    thread.join();
                } catch (InterruptedException e) {

                }
            }
        }
    }
}