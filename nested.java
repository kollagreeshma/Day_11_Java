import java.util.*;
interface out {
    void outm();
    interface in {
        void inm();
    }
}

class Main implements out.in {
    public void inm() {
        System.out.println("Hello, I'm the inner method.");
    }
    public static void main(String args[]) {
        Main m = new Main();
        m.inm();
    }
}