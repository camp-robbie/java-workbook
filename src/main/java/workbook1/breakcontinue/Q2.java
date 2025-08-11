package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용

        for(int i=1;i<=10;i++){         // i를 1부터 10까지 1씩 증가시키며 반복
            if(i%2==0){                 // i가 짝수이면
                continue;               // 현재 반복 건너뛰고 다음 반복 진행
            }
            System.out.print(i + " ");  // i가 홀수이면 출력
        }

    }
}
