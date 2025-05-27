import java.util.Random;

public class TwoDownloadingTask {
    public static void main(String[] args) {
        Random random = new Random();

        Thread download1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<100){
                    System.out.println("Downloaded file1 : " + i + " %");
                    i += random.nextInt(15);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread download2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<=100){
                    System.out.println("Downloaded file2 : " + i + " %");
                    i += random.nextInt(20);
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        download1.start();
        download2.start();
    }
}
