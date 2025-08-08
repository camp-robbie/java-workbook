package main.java.workbook1.controlflow;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력
        for (int i = 2; i <= n; i++) {             // 2부터 n까지 검사 (1은 소수 아니므로 제외)

            for (int j = 2; j <= i; j++) {         // 소수= 1와 자신만을 약수로 갖음 -> 공통된 약수 1 제외

                if (i % j == 0 ) {                 // 약수 찾기 (i가 j로 나누어지면 약수)

                    if (i == j){                   // 약수 중 소수 찾기 조건문 -> 1과 자신만을 약수로 갖음 = 소수
                        System.out.print(i + " "); // 소수 출력
                    }else{                         // 소수가 아닌 약수 발견 -> 소수 아님
                        break;                     // 소수가 아닌 약수의 경우 for문(j) 탈출
                    }
                }
            }
        }
    }
}
/* [boolean] + [Math.sqrt(i)] 사용할 경우
     => 제곱근까지만 검사하므로 더 간결한 코드!

  for (int i = 2; i <= n; i++) {                // 2부터 n까지 검사 (1은 소수 아니므로 제외)
    boolean isPrime = true;                     // isPrime 변수 선언 -> 기본값 true => 약수 발견시 false

    for (int j = 2; j <= Math.sqrt(i); j++) {   // Math.sqrt(i) = 제곱근 -> 약수는 제곱근까지만 확인하면 충분
        if (i % j == 0) {                       // 약수 판별 (i가 j로 나누어지면 약수)
            isPrime = false;                    // 약수면 false
            break;                              // 반복문(for문) 종료
        }
    }

    if (isPrime) {                               // isPrime = true 이면
        System.out.print(i + " ");               // 소수 출력
    }
}
*/
