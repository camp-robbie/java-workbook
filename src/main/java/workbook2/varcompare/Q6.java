package main.java.workbook2.varcompare;

import java.util.Scanner;

// `ChatRoom` 클래스에 클래스 변수 `totalUsers`와 인스턴스 변수 `messagesSent`를 선언하고,
// 사용자가 메시지를 보낼 때마다 총 사용자 수와 개인 메시지 수를 관리하는 프로그램을 작성
// 두 명의 사용자가 각각 메시지를 보내고 통계를 출력
class ChatRoom {
    static int totalUsers = 0;                              // 총 메시지 수를 나타낼 클래스 변수 totalUsers
    String name;                                            // 사용자 이름을 나타낼 인스턴스 변수 name
    int messagesSent = 0;                                   // 개인 메시지 수를 나타낼 인스턴스 변수 messagesSent

    // 생성자
    ChatRoom(String name) {
        this.name = name;                                   // 생성자 매개변수 name을 인스턴스 변수 name에 저장함
    }

    void sendMessages(int n) {                              // 메시지를 전송하는 메서드
        // TODO: messagesSent와 ChatRoom.totalUsers 증가
        messagesSent += n;                                  // messagesSent = messagesSent + n;
        totalUsers += n;                                    // totalUsers = totalUsers + n;

        System.out.println(name +  " " + messagesSent + " " + ChatRoom.totalUsers);    // name, messagesSent, ChatRoom.totalUsers를 출력함
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // 스캐너 시작

        String name1 = sc.next();                           // 사용자 이름을 입력받음
        int m1 = sc.nextInt();                              // 메시지를 보낼 개수를 입력받음

        String name2 = sc.next();                           // 사용자 이름을 입력받음
        int m2 = sc.nextInt();                              // 메시지를 보낼 개수를 입력받음

        ChatRoom u1 = new ChatRoom(name1);                  // 입력받은 name1을 바탕으로 ChatRoom 타입의 객체 u1을 생성함
        ChatRoom u2 = new ChatRoom(name2);                  // 입력받은 name2을 바탕으로 ChatRoom 타입의 객체 u2을 생성함

        // TODO: 각 사용자 이름과 messagesSent, ChatRoom.totalUsers 출력
        u1.sendMessages(m1);                                // 입력받은 m1을 바탕으로 u1의 sendMessages 메서드를 호출함
        u2.sendMessages(m2);                                // 입력받은 m2을 바탕으로 u2의 sendMessages 메서드를 호출함

        sc.close();                                         // 스캐너 닫기
    }
}
