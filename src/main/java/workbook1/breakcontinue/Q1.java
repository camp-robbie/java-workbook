package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {

        int sum = 0;

        // 100번 반복하는 반복문입니다.
        for(int i=1;i<=100;i++){
            // 만약에 i가 10으로 나누어 떨어지면 반복문을 종료합니다.
            // 나누어 떨어지지 않을 경우, i를 sum에 더합니다.
            if(i%10 == 0){
                break;
            }else {
                sum+=i;
            }
        }

        // 출력합니다.
        System.out.println(sum);
    }
}