package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        //반복문 시작 : 정수 1부터 100까지 순차적으로 더하기
        for(int i = 1; i<=100; i++){
            if(i % 10 != 0){ //i의 값이 10의 배수가 아닐 경우
                sum+= i;     //순차적으로 더하기
            }else{           //i값이 10의 배수일 경우
                break;       //반복문 종료
            }
        }
        // 합을 출력
        System.out.println(sum);
    }
}