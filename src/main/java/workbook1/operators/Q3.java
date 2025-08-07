package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x > y 결과와 !(x > y) 결과 출력

        boolean result = x > y;
        boolean result2 = !(x > y);

        System.out.println(result + " " + result2);

        // solution
        /*
        boolean comparison = x > y;
        boolean notComparison = !comparison;

        System.out.println(comparison + " " + notComparison);
        */

        sc.close();
    }
}