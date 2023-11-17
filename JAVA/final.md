# [Java] final




final은 클래스, 메소드, 멤버변수, 지역변수에 사용될 수 있다.

## class
변경, 확장될 수 없는 클래스가 된다.
다른 클래스의 조상이 될 수 없다!
## method
변경될 수 없는 메소드가 된다.
오버라이딩을 통한 재정의가 불가능하다.
## 멤버/지역변수
값을 변경할 수 없는 상수가 된다.
단 한번의 초기화만 가능하다.

<br>

```java
public final class Music { // 조상이 될 수 없는 클래스 
  
   private final String title = "reminder"; // 값을 변경할 수 없는 멤버 변수 (상수)
   
    final String getName() {  // 오버라이딩 할 수 없는 메소드
        final String localValue = title; // 값을 변경할 수 없는 지역 변수 (상수)
        return localValue;
   }
}
