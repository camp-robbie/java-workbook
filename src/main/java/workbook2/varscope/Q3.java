package main.java.workbook2.varscope;

class Counter {
    static int count = 0;
    int id;
    Counter() {
        // TODO: count 증가 후 id에 할당
        count++;    // count를 증가시킴
        id = count; // id에 count를 할당함
    }
}

public class Q3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // TODO: c3.id와 Counter.count 출력
        System.out.println(c3.id + " " + Counter.count);
    }
}