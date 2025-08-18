package main.java.workbook2.methodcompare;

import java.util.Scanner;

class Statistics {                    // 클래스 정의
    static int count = 0;             // 모든 인스턴스가 공유하는 클래스 변수 선언 -> 1회만 0으로 생성(초기화)
    static int sum = 0;               // 모든 인스턴스가 공유하는 클래스 변수 선언 -> 1회만 0으로 생성(초기화)

    void addNumber(int n) {           // 인스턴스 메서드 정의
        // TODO: count와 sum 갱신
        count++;                      // 갯 수 체크
        sum += n;                     // 합 누적
    }

    static double average() {         // 클래스 정적 메서드 정의
        // TODO: 평균 반환
        return ((double)sum / count); // 평균 반환 -> double 명시 안해주면 계산이 정수로 되어 소수점이 잘림
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner 생성

        int n = sc.nextInt();                       // 공백을 구분하여 첫 번째 정수 1개 읽어 n에 저장
        Statistics stat = new Statistics();         // 새로운 객체 Statistics() 생성하여, 참조를 stat에 저장

        for (int i = 0; i < n; i++) {               // i=0부터 i가 n 미만 일때까지 반복
            stat.addNumber(sc.nextInt());           // stat가 참조하는 addNumber(sc.nextInt()) 메서드 호출하여 합 계산
        }
        // TODO: Statistics.average() 출력
        System.out.println(Statistics.average());   // 평균값 출력
    }
}