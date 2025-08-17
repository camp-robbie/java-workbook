package main.java.workbook2.varcompare;

import java.util.Scanner;

class ChatRoom {                                        // 클래스 정의
    static int totalUsers = 0;                          // 모든 인스턴스가 공유하는 클래스 변수 -> 1회만 0으로 설정(초기화)
    String name;                                        // 인스턴스 변수 선언
    int messagesSent = 0;                               // 인스턴스 변수 선언 및 초기화

    ChatRoom(String name) {                             // 생성자 정의
        this.name = name;                               // name 필드 초기화
        ChatRoom.totalUsers ++;                         // 총 사용자 수 증가
    }

    void sendMessages(int n) {                          // 메서드 정의
        // TODO: messagesSent와 ChatRoom.totalUsers 증가
        messagesSent += n;                              // 개인 메세지 수 (현재 보낸 메세지 합)
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // Scanner 생성

        String name1 = sc.next();                       // 첫 번째 문자열 1개 읽어 name1에 저장
        int m1 = sc.nextInt();                          // 다음 정수 1개 읽어 m1에 저장
        String name2 = sc.next();                       // 다음 문자열 1개 읽어 name2에 저장
        int m2 = sc.nextInt();                          // 다음 정수 1개 읽어 m2에 저장

        ChatRoom u1 = new ChatRoom(name1);              // 새로운 객체 ChatRoom(name1) 생성하여, 참조를 u1에 저장
        ChatRoom u2 = new ChatRoom(name2);              // 새로운 객체 ChatRoom(name2) 생성하여, 참조를 u2에 저장

        u1.sendMessages(m1);                            // u1이 참조하는 sendMessages(m1) 메서드 호출
        u2.sendMessages(m2);                            // u2이 참조하는 sendMessages(m2) 메서드 호출
        // TODO: 각 사용자 이름과 messagesSent, ChatRoom.totalUsers 출력
        // 각 사용자 이름, messagesSent, ChatRoom.totalUsers 출력(공백으로 구분)
        System.out.println(u1.name + " " + u1.messagesSent + " " + ChatRoom.totalUsers );
        System.out.println(u2.name + " " + u2.messagesSent + " " + ChatRoom.totalUsers );

        sc.close();                                     // 입력 닫기
    }
}
