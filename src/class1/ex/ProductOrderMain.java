package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        //첫 번째 상품 주문 정보 입력
        ProductOrder order1 = new ProductOrder(); // 인스턴스 선언
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1; // 인스턴스 참조값 배열내 복사하여 대입

        ProductOrder order2 = new ProductOrder(); //인스턴스 선언
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2; // 인스턴스 참조값 배열내 복사하여 대입

        ProductOrder order3 = new ProductOrder(); //인스턴스 선언
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3; // 인스턴스 참조값 배열내 복사하여 대입

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " +order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: "+ totalAmount);
    }
}
