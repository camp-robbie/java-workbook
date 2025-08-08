package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 값은 double 이지만 int로 명시적 형변환을 했습니다.
        // 이 경우 -> 소숫점 어래는 탈락됨.
        int x = (int) sc.nextDouble();
        int y = (int) sc.nextDouble();
        int z = (int) sc.nextDouble();

        // 나누기를 사용할 경우 -> 정수가 아닌 다른 값이 나오면 자동적으로
        // 실수형으로 변환되지만, 만약 값이 정수일 경우 정수로 반환됨
        // 따라서, float 를 사용하여 무조건 float 값으로 출력되게끔 함.
        System.out.println((float)((x+y+z)/3));
    }
}
