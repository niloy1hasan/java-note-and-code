public class Private_Inner {
    private class P_Inner {
        int data = 30;
    }

    P_Inner inner = new P_Inner();
    void privateInfo(){
        System.out.println(inner.data);
    }
}
