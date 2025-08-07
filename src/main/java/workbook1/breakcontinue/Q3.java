package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력

        //입력받은 수의 합을 저장하는 변수
        int sum = 0;
        //입력받은 수의 갯수를 세는 변수
        int count = 0;
        //평균 넣어줄 변수
        double avg = 0;

        //반복문 작성
        while (true) {
            //정수 입력
            int n = sc.nextInt();

            //음수일 경우 break로 반복문 종료
            if (n < 0) {
                break;
            }
            //양수일 경우 sum과 count 변숫값 변화
            if (n > 0) {
                sum += n;
                count++;
            }
        }
        //count가 0이면 나눌 때 오류가 생기기 때문에
        if (count > 0) {
            avg = (double) sum / count;//소숫점 표현을 위해 형변환
        }
        System.out.println(avg);
        sc.close();
    }
}