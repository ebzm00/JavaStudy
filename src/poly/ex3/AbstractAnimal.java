package poly.ex3;

public abstract class AbstractAnimal {
    // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 작성!
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}