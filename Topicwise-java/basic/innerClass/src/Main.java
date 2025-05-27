public class Main{
    public static void main(String[] args) {

        //first create outer class object then access inner class
        //Outer outer = new Outer();
        //Outer.Inner inner = outer.new Inner();

        //direct access inner class
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        StaticInner.S_Inner sInner = new StaticInner.S_Inner();
        sInner.showGreetings();

        Local_Inner local_inner = new Local_Inner();
        local_inner.display();

        Anonymous_Inner anonymousInner = new Anonymous_Inner() {
            @Override
            void output() {
                System.out.println("=====anonymous=====");
            }
        };

        anonymousInner.output();

        Private_Inner privateInner = new Private_Inner();
        privateInner.privateInfo();

        Temp temp = new Temp() {
            @Override
            public void tempData() {
                System.out.println("temp");
            }
        };

        temp.tempData();
    }
}