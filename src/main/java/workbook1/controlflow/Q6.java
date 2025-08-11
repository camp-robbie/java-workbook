package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String temp;
        int sum = 0, count = 0;

        // 입력된 숫자만큼 도는 반복문입니다.
        for (int i = 1; i <= n; i++) {
            // i (temp)를 스트링으로 선언합니다.
            temp = String.valueOf(i);
            // 향상된 for 문입니다.
            // 이 경우 -> temp를 한 글자씩 c가 참조합니다.
            for (char c: temp.toCharArray()) {
                // char 를 int로 변환할 시 유니코드 값이 나옵니다.
                // 그래서, 문자 유니코드 'n' - '0' 을 해줍니다.
                // 이렇게 하면 c 를 int에 대입했을 때(또는 산술 연산을 했을 때)
                // n의 값을 가지게 됩니다.
                sum += c - '0';
            }
            // 만약 자릿수를 더한 값이 5로 나누어 떨어진다면
            // 개수를 하나 더합니다.
            if (sum%5==0){
                count++;
            }
            // 더한 값을 초기화해줍니다.
            sum = 0;
        }

        // 출력합니다.
        System.out.println(count);
    }
}