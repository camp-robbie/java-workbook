package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력
        // for 문과 continue, break를 조합하여 구현
        for(int i = 1; i <= 50; i++) {          // i는 1이고, i가 50과 같거나 작을동안 i를 1씩 증가시키며 반복 수행
            if(!(i % 3 == 0 && i % 5 != 0)) {   // 3의 배수이지만 5의 배수는 아닌 값이 아니라면
                continue;                       // 다음 반복으로 넘어감
            }

            sum += i;                           // sum = sum + i;

            if(sum>= 40) {                      // sum이 40 이상이면
                break;                          // 반복을 종료함
            }
        }
        System.out.println(sum);                // 최종 합 출력
    }
}