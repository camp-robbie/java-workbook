package main.java.workbook3.accesslevel;

import java.util.Scanner;

class SecureFile {
    //private 변수
    private String fileName;
    SecureFile(String fileName) {
        this.fileName = fileName;
    }
    public void read(boolean hasPermission) {
        // TODO: 권한이 있으면 파일 이름 출력, 없으면 "권한 없음" 출력
        System.out.println(hasPermission? "Reading "+ fileName : "권한 없음");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일 이름 입력");
        String file = sc.next();
        System.out.println("권한여부 입력 'granted' or 'denied'");
        String p1 = sc.next();
        System.out.println("권한여부 입력 'granted' or 'denied'");
        String p2 = sc.next();
        SecureFile sf = new SecureFile(file);
        sf.read(p1.equals("granted"));
        sf.read(p2.equals("granted"));

        sc.close();
    }
}