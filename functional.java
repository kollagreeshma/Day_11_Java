import java.util.*;
interface math{
    public int operation(int a,int b);
}
public class functional{
    public static void main(String args[]){
        math add=(a,b)->a+b;
        math sub=(a,b)->a-b;
        System.out.println(add.operation(6,5));
        System.out.println(sub.operation(9,6));
    }
}