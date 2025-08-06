package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력
        for(int i = 1; i <= 9; i++) {       // i는 1이고, i를 1씩 증가시켜 i가 9보다 같을 동안 반복함
            for(int j = 2; j <= 9; j++) {   // j는 2이고, j를 1씩 증가시켜 j가 9보다 같을 동안 반복함
                System.out.print(j + "*" + i + "=" + (j*i + " "));  // 구구단 결과를 출력함
            }
            System.out.println();      // 줄바꿈
        }
    }
}
