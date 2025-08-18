package main.java.workbook2.varscope;

class Sample {
    static String classVar = "class";      // 클래스 변수(static 변수) 에 "class" 값 저장
    String instanceVar = "instance";       // 인스턴스 변수에 "instance" 값 저장

    Sample() {                             // 기본 생성자 정의
    }

    Sample(String instanceVar) {           // String instanceVar 변수 갖는 Sample 생성자 정의
        this.instanceVar = instanceVar;    // 인스턴스 변수에 값("instance") 대입
    }

    void printLocal() {                    // printLocal() 메서드 정의
        String localVar = "local";         // 지역변수(localVar)에 "local" 값 저장
        // TODO: localVar 출력
        System.out.print(localVar + " ");  // 지역변수 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();                    // 새로운 객체 Sample() 생성 후, s에 참조를 저장
        s.printLocal();                             // s가 참조하는 printLocal() 메서드 호출 -> 지역변수 출력 메서드
        // TODO: instanceVar와 classVar 출력
        System.out.print(s.instanceVar + " ");      // s가 참조하는 instanceVar 출력 -> 인스턴스 변수 출력
        System.out.println(Sample.classVar);        // Sample 클래스의 클래스(static) 변수 출력
    }
}

/*  [ 클래스 변수 ]
       - 클래스 몸체 + static
       - 모든 인스턴스가 공유 -> 인스턴스 없이도 접근 가능
       - 클래스가 로딩/초기화될 때 생성 (프로그램 종료시까지 생존)
       - 기본값 자동 초기화
       - 접근은 " 클래스.변수 " 권장

    [ 인스턴스 변수 ]
       - 클래스 몸체
       - new로 객체 생성 시 생성 -> 외부에서 도달 불가가 되면 GC 대상
       - 기본값 자동 초기화
       - 접근은 "참조변수.변수" (필요시 this.변수)

    [ 지역 변수 ]
       - 메서드/생성자/블록 내부
       - 해당 블록 진입 시 생성되어, 블록 끝나면 소멸
       - 반드시 초기화 후 사용 (기본값 x)
       - 접근 제한자 / static 사용 불가 (final은 가능)

    ## GC 대상
       - Garbage Collection 대상 -> GC가 회수할 수 있는 객체
       - 프로그램 어디에서도 더 이상 도달할 수 없는 객체 (메모리만 임시로 차지)
          -> 새 객체 할당 중 공간이 부족하거나 힙 사용률이 임계치에 가까워지면 GC가 돌게 됨
          => GC가 돌면 이 객체의 메모리 회수
       - 컬렉션/static 등에서 여전히 참조 중이면 GC 대상 아님
       - 회수해도 공간 모자라면 OutOfMemoryError 가능
 */