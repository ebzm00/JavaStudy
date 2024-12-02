package extends1.exTest;

public class Item {
    private String Name;
    private int Price;

    public Item(String name, int price) {
        Name = name;
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public void print() {
        System.out.println("이름: " + this.Name + ", 가격: " + this.Price);
    }
}
