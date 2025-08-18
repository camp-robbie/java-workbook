package main.java.workbook2.varcompare;

import java.util.Scanner;

class Product {
    static int totalSold = 0;                     // 모든 인스턴스가 공유하는 클래스 변수 -> 한번만 0으로 설정(초기화)
    int stock;                                    // 인스턴스 변수 선언

    Product(int stock) {                          // 생성자 정의
        this.stock = stock;                       // 필드 초기화
    }

    void sell(int quantity) {                     // 판매 메서드 정의
        // TODO: stock 감소, totalSold 증가
        stock -= quantity;                        // 재고 감소 (재고 - 현재판매량)
        totalSold += quantity;                    // totalSold 증가 (총판매량 + 현재판매량)
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // Scanner 생성

        int initialStock = sc.nextInt();          // 정수 1개 읽어 initialStock에 저장
        Product p = new Product(initialStock);    // 새로운 객체 Product(initialStock) 생성하여, 참조를 p에 저장

        for (int i = 0; i < 2; i++) {             // i=0부터 1까지 반복문 수행
            String cmd = sc.next();               // 다음 문자열 1개 읽어 cmd 에 저장
            int q = sc.nextInt();                 // 다음 정수 1개 읽어 q 에 저장
            p.sell(q);                            // p가 참조하는 sell(q) 메서드 호출
        }
        // TODO: p.stock과 Product.totalSold 출력
        // p가 참조하는 stock 값과 Product 클래스의 totalSold 값 출력(공백으로 구분)
        System.out.println(p.stock + " " + Product.totalSold);

        sc.close();                               // 입력 닫기
    }
}
