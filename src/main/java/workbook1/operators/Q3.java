package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
<<<<<<< HEAD
        // TODO: x > y 결과와 !(x > y) 결과 출력
=======
        // TODO: x > y 결과와 !(x < y) 결과 출력
        if (x > y) {
            System.out.print(true + " ");
        } else {
            System.out.print(false + " ");
        }

        if (!(x > y)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

//        System.out.println(!(x > y));

//        boolean result = x > y;
//        System.out.println(result + " " +!result);

>>>>>>> step1/operators
    }
}