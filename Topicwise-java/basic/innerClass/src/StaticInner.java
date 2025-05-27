public class StaticInner {
    static String greetings = "Hello World!";
    static class S_Inner{
        void showGreetings(){
            System.out.println(greetings);
        }
    }
}
