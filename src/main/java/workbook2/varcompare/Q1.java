package main.java.workbook2.varcompare;

class Counter {

    // 필드
    static int count = 0;
    int id;

    // 생성자
    Counter() {
        this.id = ++Counter.count;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        System.out.println(c1.id + " " + Counter.count);

        Counter c2 = new Counter();
        System.out.println(c2.id + " " + Counter.count);

    }
}
