package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    int[] arr = new int[5];
    {
        // TODO: arr 배열을 난수로 채움
        Random rand = new Random();
        for(int i = 0; i<5; i++){
            arr[i] = rand.nextInt(100)+ 1;              //1~100까지 랜덤 생성
        }
    }
    void printArray() {
        // TODO: arr 요소 출력
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();
        obj.printArray();
    }
}
