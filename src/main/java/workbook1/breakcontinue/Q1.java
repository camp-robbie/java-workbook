package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break

        for(int i=1;i<=100;i++){    // 1부터 100까지 반복
            if(i%10==0){            // 10의 배수가 나오면
                break;              // 반복문(for문) 즉시 종료!
            }else{                  // 그렇지 않다면
                sum+=i;             // 현재 i값을 sum 변수에 합산
            }
        }
        System.out.println(sum);    // 종료 전까지 누적된 합 출력
    }
}