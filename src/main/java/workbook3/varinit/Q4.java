package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    int[] arr = new int[5];

    {
        // TODO: arr 배열을 난수로 채움
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10); // 0~9 난수
        }
    }

    void printArray() {
        // TODO: arr 요소 출력
        void printArray () {
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }
    }

    public class Q4 {
        public static void main(String[] args) {
            RandomInit obj = new RandomInit();
            obj.printArray();
        }
    }
}