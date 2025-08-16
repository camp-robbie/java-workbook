package main.java.workbook2.varcompare;

import java.util.Scanner;

// `Product` 클래스에 클래스 변수 `totalSold`와 인스턴스 변수 `stock`을 선언하고, 판매 메서드 `sell(int quantity)`를 통해 재고를 감소시키고 `totalSold`를 증가시키는 프로그램을 작성
// 2건의 판매 후 재고와 총 판매량을 출력
class Product {
    static int totalSold = 0;       // 총 판매량을 나타내는 클래스 변수 totalSold
    int stock;                      // 재고량을 나타내는 인스턴스 변수 stock

    // 생성자
    Product(int stock) {
        this.stock = stock;         // 생성자 매개변수 stock을 인스턴스 변수 stock에 저장함
    }

    // 판매 메서드 sell
    void sell(int quantity) {
        // TODO: stock 감소, totalSold 증가
        if(stock < quantity) {                  // 만약 stock이 quantity보다 작다면 (판매하려는 수량이 재고량보다 많다면)
            System.out.println("재고 부족");     // 재고 부족을 출력함
        }

        stock -= quantity;                                // stock = stock - quantity
        totalSold += quantity;                            // totalSold = totalSold + quantity

    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 열기

        int initialStock = sc.nextInt();        // 재고량을 입력받음
        Product p = new Product(initialStock);  // 입력받은 initialStock 바탕으로 Product 객체 p 생성

        for (int i = 0; i < 2; i++) {           // i는 0이고, i가 0보다 작을동안 i를 1씩 증가시키면서 반복함
            String cmd = sc.next();             // 할 작업을 입력받음 (이거 굳이 있어야 하나?)
            int q = sc.nextInt();               // 판매 개수를 입력받음
            p.sell(q);                          // p 객체의 매개변수를 q로 하는 sell 메서드를 호출함
        }

        // TODO: p.stock과 Product.totalSold 출력
        System.out.println(p.stock + " " + Product.totalSold);  // p의 인스턴스 변수 stock과 Product의 클래스 변수 totalSold를 출력함
    }
}
