public class Local_Inner {
    void display(){
        class L_Inner {
            void showMessage(){
                System.out.println("This is a Local Inner class");
            }
        }

        L_Inner inner = new L_Inner();
        inner.showMessage();
    }
}
