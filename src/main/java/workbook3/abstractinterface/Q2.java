package main.java.workbook3.abstractinterface;

import java.util.Scanner;

//interface Playable
interface Playable {
    //Playable을 구현하는 모든 클래스는 play() 메서드를 반드시 구현해야 함
    void play();
}
// Playable을 구현한 Piano 클래스
class Piano implements Playable {
    public void play() {
        // Piano 연주 출력
        // TODO: "Piano plays" 출력
        System.out.println("Piano plays");
    }
}
// Playable을 구현한 Guitar 클래스
class Guitar implements Playable {
    public void play() {
        // Guitar 연주 출력
        // TODO: "Guitar plays" 출력
        System.out.println("Guiter plays");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("악기종류 입력 : 'piano' or 'guitar'");
        String i1 = sc.next();
        System.out.println("악기종류 입력 : 'piano' or 'guitar'");
        String i2 = sc.next();
        // i1,i2 값에 따라 Playable 객체 생성
        Playable inst1 = i1.equals("piano") ? new Piano() : new Guitar();
        Playable inst2 = i2.equals("piano") ? new Piano() : new Guitar();
        // Playable 객체의 play() 호출
        inst1.play();
        inst2.play();
    }
}
