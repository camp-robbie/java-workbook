package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용

        //1~10까지 반복
        for (int i = 1; i <= 10; i++) {
            //짝수일 경우
            if(i % 2==0){
                //건너뛰기
                continue;
            }
            //아닐 경우 출력
            System.out.print(i + " ");
        }
    }
}
