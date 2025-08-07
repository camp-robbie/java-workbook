package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 반복문에 사용할 변수를 선언합니다.
        // i 는 인덱스, sum은 총 합계를 뜻합니다.
        int i = 0;
        int sum = 0;

        // do-while 문입니다.
        // 장점 -> 최소 한 번은 실행된다.
        do {
            if(i % 3 == 0){
                sum += i;
            }
            i++;
        }while (i<=n);

        // 출력합니다.
        System.out.println(sum);
    }
}
