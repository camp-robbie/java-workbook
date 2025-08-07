package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        // 중첩 for 문에서 continue를 사용하여 30 이상인 경우 출력

        for(int i = 2; i <= 9; i++) {       // i는 2이고, i가 9보다 작거나 같을 동안 i를 1씩 증가시키며 반복 수행
            for(int j = 1; j <= 9; j++) {   // j는 1이고, j가 9보다 작거나 같을 동안 j를 1씩 증가시키며 반복 수행
                if(i * j >= 30) {           // i와 j를 곱한 결과가 30이상이라면
                    continue;               // 다음 반복으로 넘어감
                }
                System.out.print(i + "*" + j + "=" + (i*j) + " ");  // 구구단 결과 출력
            }
            System.out.println();   // 줄바꿈
        }
    }
}
