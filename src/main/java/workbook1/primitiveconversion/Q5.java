package main.java.workbook1.primitiveconversion;

import java.awt.*;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
        int Ix = (int)x; // x 강제 형 변환 (double -> int)
        int Iy = (int)y; // y 강제 형 변환 (double -> int)
        int Iz = (int)z; // z 강제 형 변환 (double -> int)

        float avg = (Ix + Iy + Iz) / 3; // 세 값의 평균 자동 형 변환 (int -> float)

        System.out.println(avg); // 평균값 출력
    }
}
