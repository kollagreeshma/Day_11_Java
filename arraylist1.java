import java.util.*;
class arraylist1{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(897);
        a.add(456);
        a.add(324);
        // adding at particular index
        a.add(1,567);
        System.out.println(a);
        // modifing
        a.set(2,4563);
        System.out.println(a);
    }
}