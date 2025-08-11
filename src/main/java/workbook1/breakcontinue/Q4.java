package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        // 첫 번째 시도 - 결과는 맞았다!!!!!!!!!! 출력이 원하는대로 안나왔을 뿐
//        for (int dan = 2; dan <= 9; dan++) {
//            for (int i = 1; i <= 9; i++) {
//                if ((dan * i) >= 30) {
//                    continue;
//                } else {
//                    System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
//                }
//                System.out.println();
//            }
//        }

        // 두 번째 시도 - 출력 수정, 성공!!!!!
        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                if ((dan * i) >= 30) {
                    continue;
                } else {
                    System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
                }
            }
            System.out.println();
        }

    }
}
