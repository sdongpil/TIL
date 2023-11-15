## Java

- __Java 컴파일 과정__
    - Java 소스 코드(.java) ---Java Compiler(javac)--> Java 바이트 코드(.class)
    - Java 바이트 코드(.class) ---Class Loader--> JVM
        - 이제 JVM 안의 실행 엔진에 의해 기계어로 해석 후 메모리 상에 배치
        - 실행 엔진에는 Interpreter와 JIT Compiler가 있음
            - Interpreter: Java 바이트 코드 한 줄씩 실행, slow
            - JIT Compiler: 전체 바이트 코드 컴파일, slow but after cached fast

- __JVM 메모리 구조__
    - Stack Area
        - 클래스 내의 메서드에서 사용되는 정보들의 저장
        - 매개변수, 지역변수, 리턴값 등
    - Method Area
        - 클래스, 메서드, 인스턴스 변수, 클래스 변수, 상수 등 저장
    - Heap Area
        - New 명령어를 통해 생성한 인스턴스
        - 참조형 변수 정보들이 저장
        - GC의 대상
    - PC Register Area
        - Thread 별로 하나씩 생성된 JVM 명령의 주소값이 저장되는 곳
    - Native Method Stack Area
        - Java 외의 다른 언어의 호출 담당
        - C/C++을 호출하는 Stack 영역

- __JDK, JRE, JVM__
    - JDK > JRE > JVM 관계
        - JVM: OS 별로 다름. Bytecode를 검증하고 실행
        - JRE: JVM + 시스템 라이브러리들을 가지고 있음 *(scanner 등)*
        - JDK: JRE + 개발을 위한 도구 *(compiler, debugger 등)*

