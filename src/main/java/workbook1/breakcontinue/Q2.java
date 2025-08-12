package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {

        // 10번 반복하는 구문입니다.
        // 만약 i를 2로 나누어 떨어지면 continue;
        // 나누어 떨어지지 않는다면(홀수라면) i를 출력합니다.
        for (int i = 1; i<=10; i++){
            if (i%2 ==0){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
