package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        for(int i =1; i<=50; i++){

            if(i%3!=0){         //3의 배수가 아니면 건너뛰기
                continue;
            }
            if(i%5==0){             //5의 배수면 건너 뛰기
                continue;
            }
            sum += i;               //sum에 조건에 만족하는 i 더하기

            if(sum>=40){            // 값이 40 이상이면 break
                break;
            }
        }
        System.out.println(sum);    // 최종 합 출력
    }
}