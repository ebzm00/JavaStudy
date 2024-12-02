package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicField() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultField() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateField() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicField();
        defaultField();
        privateField();
    }
}
