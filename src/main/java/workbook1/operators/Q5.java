package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // += 는 할당 연산자로, 가장 낮은 우선순위를 가집니다.
        // 사칙연산 중에서도 *는 +보다 높은 우선순위를 가지니,
        // 할당하는 과정을 줄임으로 메모리의 성능을 고려합니다.
        // a += b*c 에서 a의 값은 결과적으로 a+b*c와 같습니다.
        System.out.println((a+b*c)+" "+b+" "+c);
    }
}
