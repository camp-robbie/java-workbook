package main.java.workbook1.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();

            // TODO: while 문을 이용하여 1부터 n까지의 합 출력
            int one = 1; // 조건이 1부터의 합이기 때문에 1을 변수에 저장
            int sum = 0; // 결과 값을 구할 변수 생성

            while (one <= n) { // 조건을 1부터 입력 값까지 반복하도록 설정
                sum += one;
                one++; // 후위 증가를 활용하여 +1을 증가 시킨 값을 one에 저장
            }

            System.out.println("결과 값은 : " + sum); // 결과 값 출력
        } catch (InputMismatchException e){
            System.out.println("숫자만을 입력해주세요.");
        }  catch (IllegalArgumentException e) {
            System.out.println("0 이상의 값을 입력해주세요..");
        }

        sc.close(); // 자원 누수 방지
    }
}


