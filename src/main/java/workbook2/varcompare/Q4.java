package main.java.workbook2.varcompare;

import java.util.Scanner;

class Product {

    // 필드
    static int totalSold = 0;
    private int stock;

    // getter
    public int getStock() {
        return stock;
    }

    // 생성자
    Product(int stock) {
        this.stock = stock;
    }

    // stock(재고) 은 감소시키고, totalSold는 증가시키는 메서드
    void sell(int quantity) {
        this.stock -= quantity;
        Product.totalSold += quantity;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialStock = sc.nextInt();

        // 객체 생성
        Product p = new Product(initialStock);

        // 2번 반복하는 반복문입니다.
        // cmd가 sell일 때 조건문을 추가할 수도 있지만,
        // Product 클래스에서 구현된 메서드가 하나 뿐이라 조건문을 추가하지 않았습니다.
        for (int i = 0; i < 2; i++) {
            String cmd = sc.next();
            int q = sc.nextInt();
            p.sell(q);
        }

        System.out.println(p.getStock()+" "+Product.totalSold);
    }
}
