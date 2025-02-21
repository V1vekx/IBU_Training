package interfaceVsAbstractClass;

class Overload{

    public void add(int a , int b){
        System.out.println("sum = "+(a+b));

    }
    public void add(int a , int b, int c) {
        System.out.println("sum = " + (a + b + c));
    }
    public void add(double a , double b) {
        System.out.println("sum = " + (a + b));
    }
}
public class OverloadEx{

    public static void main(String[] args) {

        Overload overload = new Overload();

        overload.add(2,6);
        overload.add(5.5,1.5);
        overload.add(4,6,7);
    }
}