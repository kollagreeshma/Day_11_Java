import java.util.*;
abstract interface math {
    void print();
}
class D implements math {
    public void print() {
        System.out.println("hi");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        D d = new D();
        d.print();
    }
}