package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 실수형 숫자를 입력해주세요 : ");
        double x = sc.nextDouble();
        System.out.println("두 번째 실수형 숫자를 입력해주세요 : ");
        double y = sc.nextDouble();
        System.out.println("세 번째 실수형 숫자를 입력해주세요 : ");
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력

        int x_num = (int) x;
        int y_num = (int) y;
        int z_num = (int) z;

        //배열 생성
        int[] arr = {x_num, y_num, z_num};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i]; //int 배열 객체 값 더하기
        }

        float average = sum / arr.length;

        System.out.println("세 값의 평균 : " + average);
    }
}
