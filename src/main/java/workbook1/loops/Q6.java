package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {

        // 구구단을 출력하는 for 문입니다.
        // i와 j는 1에서 9까지 반복되고,
        // 둘을 곱하고 출력합니다.
        for(int i = 1; i<10; i++){
            for(int j = 1; j<10; j++){
                System.out.print(j+"*"+i+"="+(j*i)+" ");
            }
            System.out.println();
        }
    }
}