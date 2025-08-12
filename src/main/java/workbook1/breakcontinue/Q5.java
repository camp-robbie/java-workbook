package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {

        // 외부 반복문 (라벨 : outer) 입니다.
        // i와 j의 더한 값이 6이라면
        // 중첩 반복문 내부의 if 문이 true가 되고,
        // 라벨을 통해 외부의 반복문까지 한번에 종료합니다.
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i+j==6){
                    System.out.println("("+i+","+j+")");
                    break outer;
                }
            }
        }

    }
}
