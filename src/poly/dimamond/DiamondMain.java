package poly.dimamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommmon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommmon();
    }
}
