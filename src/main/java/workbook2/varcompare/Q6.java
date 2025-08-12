package main.java.workbook2.varcompare;

import java.util.Scanner;

class ChatRoom {

    // 필드
    static int totalUsers = 0;
    private final String name;
    private int messagesSent = 0;

    // getter
    public String getName() {
        return name;
    }
    public int getMessagesSent() {
        return messagesSent;
    }

    // 생성자
    ChatRoom(String name) {
        this.name = name;
    }

    // 총 사용자 수와 개인 메시지 수를 관리합니다.
    // 이 메서드를 통해 개인 메시지 와 총 사용자 수가 증가합니다.
    void sendMessages(int n) {
        this.messagesSent += n;
        ChatRoom.totalUsers += n;
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 유저 이름
        String name1 = sc.next();
        // 보내는 메시지 갯수
        int m1 = sc.nextInt();

        String name2 = sc.next();
        int m2 = sc.nextInt();

        // 객체를 생성합니다.
        ChatRoom u1 = new ChatRoom(name1);
        ChatRoom u2 = new ChatRoom(name2);

        u1.sendMessages(m1);
        u2.sendMessages(m2);

        // 출력합니다.
        System.out.println(u1.getName()+" "+u1.getMessagesSent()+" "+ChatRoom.totalUsers);
        System.out.println(u2.getName()+" "+u2.getMessagesSent()+" "+ChatRoom.totalUsers);
    }
}
