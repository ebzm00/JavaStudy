package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();


        //다들 패키지 접근 불가
        //DefaultClass class1 = new DefaultClass1();
    }
}
