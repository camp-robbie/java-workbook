package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        // 첫 번째 시도 - 구구단 전체가 출력이 됐지만 출력이 올바르지 않음.
//        for(int i = 1; i <= 9; i++) {
//            for(int dan = 2; dan <= 9; dan ++) {
//                System.out.println(dan + " * " + i + " = " + (dan * i));
//            }
//        }

        // 두 번째 시도 - 역시나 출력이 올바르지 않음.
//        for(int i = 1; i <= 9; i++) {
//            for(int dan = 2; dan <= 9; dan ++) {
//                System.out.print(dan + " * " + i + " = " + (dan * i) + " ");
//            }
//            System.out.println();
//        }

        // 세 번째 시도 - 정답을 몰라서 지피티한테 물어봄.
        // \t 라는 탭 문자를 넣어줘야 한다고 한다. 근데 탭 키는 빈 간격을 만들어주는 특수 문자라고 하는데 이게 어떻게 9개씩 딱 맞게 끊어주는지는 이해가 가지 않는다.

        for(int i = 1; i <= 9; i++) {
            for(int dan = 2; dan <= 9; dan ++) {
                System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
            }
            System.out.println();
        }

    }
}