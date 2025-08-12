package main.java.workbook2.varscope;

class Counter {

    // 필드
    static int count = 0;
    int id;

    // 생성자
    // count에 1을 더하고, 이것을 id에 할당합니다.
    Counter() {
        id = ++count;
    }
}

public class Q3 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c3.id+" "+Counter.count);
    }
}