package extends1.exTest;

public class Book extends Item{

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        super.print();  //상위 클래스로내에 있는 print 메서드 출력
        System.out.println("- 저자:" + author +", isbn:"+ isbn);
    }

}
