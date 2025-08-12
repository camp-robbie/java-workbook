package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Statistics {

    // 필드
    // count와 sum이 static이 아니라면
    // average() 에서 사용할 수 없습니다.
    // (클래스 메서드는 인스턴스 변수에 접근할 수 없음)
    static int count = 0;
    static int sum = 0;

    // 입력된 값을 더해서 저장하고, 메서드가 호출될 때마다 count를 1씩 증가시킵니다.
    void addNumber(int n) {
        sum += n;
        count++;
    }

    // sum/count 를 통해 평균을 구합니다.
    static double average() {
        return (double) sum / count;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 반복할 횟수
        int n = sc.nextInt();

        // addNumber() 메서드를 호출하기 위해 객체를 생성합니다.
        Statistics stat = new Statistics();

        // 입력받은 횟수만큼 반복하며,
        // addNumber() 메서드를 실행하는 반복문입니다.
        for (int i = 0; i < n; i++) {
            stat.addNumber(sc.nextInt());
        }

        // 출력합니다.
        System.out.println(Statistics.average());
    }
}