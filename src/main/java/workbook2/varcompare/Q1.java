package main.java.workbook2.varcompare;

// Counter` 클래스를 설계하여 클래스 변수 `count`와 인스턴스 변수 `id`를 선언하고, 객체를 2개 생성할 때마다 `id`와 `count`를 출력하는 프로그램을 작성
// Counter 클래스
class Counter {
    static int count = 0;       // 생성된 객체의 개수를 세는 클래스 변수 count
    int id;                     // int 형 변수 id
    Counter() {
        // TODO: count 증가 후 id에 할당
        id = ++count;           // 객체 생성 시 count 증가시키고, id에 count 값을 저장함
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();                         // Counter 변수 c1 생성
        System.out.println(c1.id + " " + Counter.count);    // c1의 인스턴스 변수 id와 클래스 변수 count를 출력함
        Counter c2 = new Counter();                         // Counter 변수 c2 생성
        System.out.println(c2.id + " " + Counter.count);    // c2의 인스턴스 변수 id와 클래스 변수 count를 출력함
    }
}
