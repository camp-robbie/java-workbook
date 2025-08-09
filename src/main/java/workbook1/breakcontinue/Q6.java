package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        // 첫 번째 시도 - 값이 아니라 합이 40이상일 때 출력을 해서 실패
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 || i % 5 != 0) {
//                sum += i;
//            } else if (sum >= 40) {
//                break;
//            }
//        }
//        System.out.println(sum);

        // 두 번째 시도 - 228이 출력이 되어야 하는데 685가 출력되어 실패
//        for (int i = 1; i <= 50; i++) {
//            if (i >= 40) {
//                break;
//            } else if (i % 3 == 0 || i % 5 != 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        // 세 번째 시도 - 273이 출력 됐다,,, so close!!
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            } else if (i % 5 != 0) {
//                continue;
//            } else if (i >= 40) {
//                break;
//            }
//        }
//        System.out.println(sum);

        // 네 번째 시도 - 성공... AND라고 노트에 잘 써놓고 실제 코드에는 OR을 썼다,,, 휴,,,,,,,,,
        for (int i = 1; i <= 50; i++) {
            if (i >= 40) {
                break;
            }

            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}