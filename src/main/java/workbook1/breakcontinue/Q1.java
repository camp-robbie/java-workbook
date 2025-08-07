package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break

        //1~100까지의 정수 중에서 반복
        for (int i = 1; i <= 100; i++) {
            //10의 배수가 나오면
            if (i % 10 == 0) {
                break;//반복 종료
            }
            sum += i;
        }
        System.out.println(sum);
    }
}