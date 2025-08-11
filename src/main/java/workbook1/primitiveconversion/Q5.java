package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        //X,y,z int로 형변환
        int a = (int)x;
        int b = (int)y;
        int c = (int)z;
        //평균값 구하기
        float avg = (a+b+c)/3.0f;
        //출력
        System.out.println(avg);
    }
}
