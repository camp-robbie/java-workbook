package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        //2~9단까지 반복
        for (int i = 2; i <= 9; i++) {
            //* 1, * 2,......, * 9 까지 반복
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                //만약 결과가 30 이상이면 넘어가기
                if (result >= 30) {
                    continue;
                }
                //결과 출력
                System.out.print(i + "*" + j + "=" + i*j + "\t");// \t로 열 맞추기
            }
            //행 변환
            System.out.println();
        }
    }
}
