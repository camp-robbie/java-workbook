package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력

        // 첫 번째 시도 - 합계가 나오긴 했지만 10도 포함이 되어 계산이 됐다.
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            if (i % 10 == 0) {
//                break;
//            }
//        }
//        System.out.println(sum);

        // 두 번째 시도 - sum 위치 조절해서 성공
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}