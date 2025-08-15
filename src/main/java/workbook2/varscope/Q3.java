package main.java.workbook2.varscope;

class Counter {
    // 생성된 객체 수를 공유하는 클래스 변수
    static int count = 0;

    // 각 객체의 고유 id 생성
    int id;

    Counter() {
        // TODO: count 증가 후 id에 할당
        id = ++count;       // ++count: count를 1 증가시킨 '후'의 값을 반환 -> 첫 객체가 id = 1을 갖게 됨
    }
}

public class Q3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // TODO: c3.id와 Counter.count 출력

        // 마지막에 생성된 c3의 id와, 전체 개수를 나타내는 Counter.count를 출력
        System.out.println(c3.id + " " + Counter.count);    // 출력: "3 3"
    }
}