package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: 1~n까지의 소수를 찾아 출력
        // 반복문 안에서 또 다른 반복문을 사용하여 소수 여부를 판단
        // 소수는 1과 자신만을 약수로 갖는 수
        for(int i = 2; i <= n; i++) {       // i는 2고, i가 n보다 작거나 같을 동안 i를 1씩 증가시키며 반복 수행
            boolean prime = true;           // 소수가 맞는 경우에만 출력하기 위한 boolean 변수
            for(int j = 2; j < i; j++) {    // j는 2고, j가 i보다 작을 동안 j를 1씩 증가시키며 반복 수행
                if(i % j == 0) {            // i가 j로 나누어 떨어진다면 (나머지가 0이라면)
                    prime = false;          // 1과 자신만을 약수로 갖는 것이 아니기 때문에 false로 바꿈
                }
            }
            if(prime) {                     // prime가 true라면 (소수라면)
                System.out.print(i + " ");  // i의 값을 출력함
            }
        }
    }
}