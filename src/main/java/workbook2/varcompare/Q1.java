package main.java.workbook2.varcompare;

class Counter {
    static int count = 0;               // 클래스 변수(static) -> 모든 인스턴스에게 공유
                                        // => 한번만 0으로 설정(초기화)
    int id;                             // 인스턴스 변수 선언

    Counter() {                         // 생성자 정의
        // TODO: count 증가 후 id에 할당
        count ++;                       // count 1 증가
        id = count;                     // id에 count값 할당
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();                       // 새로운 객체 Counter() 생성하여, 참조를 c1에 저장
        System.out.println(c1.id + " " + Counter.count);  // c1.id + 공백 + Counter.count 출력
        Counter c2 = new Counter();                       // 새로운 객체 Counter() 생성하여, 참조를 c2에 저장
        System.out.println(c2.id + " " + Counter.count);  // c2.id + 공백 + Counter.count 출력
    }
}
