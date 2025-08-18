package main.java.workbook2.methodcompare;

import java.util.Scanner;

// `Statistics` 클래스에 클래스 변수 `count`와 클래스 메서드 `average`를 정의하고,
// 인스턴스 메서드 `addNumber`를 통해 숫자를 추가하면 `count`와 총합을 갱신하여 평균을 계산하는 프로그램을 작성
class Statistics {
    static int count = 0;                   // 입력된 숫자의 개수를 나타낼 클래스 변수 count
    static int sum = 0;                     // 총합을 나타낼 클래스 변수 sum

    // 인스턴스 메서드 addNumber
    void addNumber(int n) {
        // TODO: count와 sum 갱신
        count++;                            // count를 증가시킴
        sum += n;                           // sum = sum + n;
    }

    // 클래스 메서드 average
    static double average() {
        // TODO: 평균 반환
        return (double) sum / count;       // sum를 count로 나눈 값(평균)을 반환함 (소수점 버리지 않도록 double형으로 업캐스팅)
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 시작

        int n = sc.nextInt();                   // 숫자를 입력받음

        Statistics stat = new Statistics();     // Statistics 타입의 stat 객체를 생성함 (생성자를 생성하지 않았을 경우, 기본 생성자는 자동으로 만들어짐)

        for (int i = 0; i < n; i++) {           // i는 0이고, i가 n보다 작을동안 1씩 증가시키며 반복 수행
            stat.addNumber(sc.nextInt());       // stat 객체의 addNumber 메서드를 호출함 (매개변수는 입력받음)
        }

        // TODO: Statistics.average() 출력
        System.out.println(Statistics.average());   // 결과를 출력함

        sc.close();                                 // 스캐너 닫기
    }
}