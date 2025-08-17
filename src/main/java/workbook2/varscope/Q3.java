package main.java.workbook2.varscope;

class Counter {
    static int count = 0;                   // 클래스 변수(모든 인스턴스(객체)가 공유) -> 최초 호출 시 초기값 = 0
    int id;                                 // 인스턴스 변수 선언

    Counter() {                             // 생성자 정의
        // TODO: count 증가 후 id에 할당
        count++;                            // 객체가 하나 생성될 때마다 count 1 증가
        id = count;                         // 증가된 값을 현재 인스턴스(객체)의 id로 저장
    }
}

public class Q3 {
    public static void main(String[] args) {
        // 객체 생성 -> 생성자 실행 -> "count 증가 & id 설정"
        Counter c1 = new Counter();                       // 새로운 객체 Counter() 생성하여 c1에 참조를 저장 -> count = 1
        Counter c2 = new Counter();                       // 새로운 객체 Counter() 생성하여 c2에 참조를 저장 -> count = 2
        Counter c3 = new Counter();                       // 새로운 객체 Counter() 생성하여 c3에 참조를 저장 -> count = 3
        // TODO: c3.id와 Counter.count 출력
        System.out.println(c3.id + " " + Counter.count);  // c3.id 와 Counter.count 출력

        // -> count는 static 변수이므로 공유되기 때문에 객체 생성시마다 +1씩 증가됨
    }
}