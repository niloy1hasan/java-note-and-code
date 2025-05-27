public class ThreadTester {
    public static void main(String[] args) {
        MyThread thread  = new MyThread();
        thread.start();

        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MyRunnable runnable = new MyRunnable();
        Thread interfaceThread = new Thread(runnable);
        interfaceThread.start();


        //lambda expression
        Thread lThread = new Thread();

    }
}
