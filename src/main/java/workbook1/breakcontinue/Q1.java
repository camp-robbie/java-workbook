package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;

        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // for 문과 break를 사용
        // 합을 출력
        for(int i = 1; i <= 100; i++) {     // i는 1이고, i가 100과 같거나 작을 때동안 i를 1씩 증가시키며 반복 수행
            if(i % 10 == 0) {               // i를 10으로 나눈 나머지가 0이라면 (i가 10의 배수라면)
                break;                      // 반복을 종료함
            }
            sum += i;                       // sum = sum + i;
        }
        System.out.println(sum);            // sum을 출력함
    }
}