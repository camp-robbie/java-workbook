package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 n 까지의 수 중 3의 배수의 합을 구하는 프로그램입니다.");
        System.out.print("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        // do-while??? 낯설다 너...
        /// while 문과 비교
        //while - 조건식이 참 일 때 코드가 실행되는 것
        //do while - 무조건 한 번 이상 실행되는 것

        // 링크 : https://nirsa.tistory.com/160
        ///  테스트1
//        int num1 = 6;           // 변수에 6할당
//        do {
//            System.out.println(num1);
//            num1++;                     // 6
//        } while (num1 <= 5);
//        System.out.println("작동하나요?");   // 작동하나요?

        ///  테스트2
//        int num2 = 4;               // 1. 변수에 4 할당
//        do {                                        // 5. 돌아와서 num +1 = 5
//            System.out.println(num2);   // 2. num = 4 출력
//            num2++;             // 3. num = 5       // 6. num = 6
//        } while (num2 <= 5);    // 4. while 참      // 7. while 거짓
//        System.out.println("작동하나요?");   // 작동하나요?

        /// 배수 생성
        //주어진 수 (예: num)에 1부터 시작하는 정수 (예: i)를 곱하여 배수를 구할 수 있습니다.
        //반복문을 사용하여 여러 개의 배수를 생성할 수 있습니다.
        //예시
        //int num = 3; // 예시 숫자
        //        for (int i = 1; i <= 10; i++) {
        //            System.out.println(num + " * " + i + " = " + (num * i));
        //        }

        /// 배수 판별
        //주어진 수 (target)를 판별하려는 수 (num)로 나눈 나머지가 0인지 확인하여 배수 여부를 판단합니다.
        //나머지가 0이면 target은 num의 배수입니다.
        //예시
        //int target = 12;
        //        int num = 4;
        //        if (target % num == 0) {
        //            System.out.println(target + "는 " + num + "의 배수입니다.");
        //        } else {
        //            System.out.println(target + "는 " + num + "의 배수가 아닙니다.");
        //        }

        int sum = 0;
        int num = 1;  // 1부터 n까지의 수

        do {
            if(num % 3 == 0){
                sum += num;
            }
            num++;
        } while (num <= n);

        System.out.println("3의 배수의 합: "+ sum);
    }
}
