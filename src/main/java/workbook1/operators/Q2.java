package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //전위증가
        int pre = ++num;
        //후위증가
        int post = num++;
        //출력
        System.out.println(pre + " " + post);
    }
}
