package main.java.workbook2.methodcompare;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

class Statistics {
    static int count = 0;
    static int sum = 0;
    void addNumber(int n) {
        // TODO: count와 sum 갱신
        count++;
        sum += n;
    }
    static double average() {
        // TODO: 평균 반환
        return (double)sum/count;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Statistics stat = new Statistics();
        for (int i = 0; i < n; i++) {
            stat.addNumber(sc.nextInt());
        }
        // TODO: Statistics.average() 출력
        System.out.println(Statistics.average());
    }
}