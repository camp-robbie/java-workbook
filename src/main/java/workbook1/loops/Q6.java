package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        //구구단 전체를 출력
        for(int i = 2; i<=9; i++){
            for(int j = 1; j<=9; j++){
                System.out.print(i + "*" + j + "= "+ i*j +" ");
            }
            System.out.println();
        }
    }
}