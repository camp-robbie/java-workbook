package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력 함

        int i = 1;
        while(sum != 10){ // 혹은 sum %10 == 0이면 멈추는 방법
            sum += i++;
            System.out.println(sum);
        }
    }
}