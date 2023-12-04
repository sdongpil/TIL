## Call by value와 Call by reference
<br>

#### call by value

> 값에 의한 호출

함수가 호출될 때, 메모리 공간 안에서는 함수를 위한 별도의 임시공간이 생성됨
(종료 시 해당 공간 사라짐)

call by value 호출 방식은 함수 호출 시 전달되는 변수 값을 복사해서 함수 인자로 전달함

이때 복사된 인자는 함수 안에서 지역적으로 사용되기 때문에 local value 속성을 가짐

```
따라서, 함수 안에서 인자 값이 변경되더라도, 외부 변수 값은 변경안됨
```

<br>

##### 예시

```Java
public class Exam {
  static void method1(int number) {
    number = 20;
  }

  public static void main(String[] args) {
    int number = 10;
    method1(number);
    System.out.println(number);
  }
}

```

>  출력되는 값은 그대로 10이 출력된다.

<br>

#### call by reference

> 참조에 의한 호출

call by reference 호출 방식은 함수 호출 시 인자로 전달되는 변수의 레퍼런스를 전달함

따라서 함수 안에서 인자 값이 변경되면, 아규먼트로 전달된 객체의 값도 변경됨

```Java
public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Main {
    static void modifyPersonName(Person person, String newName) {
        person.name = newName;
    }

    public static void main(String[] args) {
        Person john = new Person("John");
        
        System.out.println("Before: " + john.name);
        modifyPersonName(john, "Jane");
        System.out.println("After: " + john.name);
    }
}

```

> john은 Jane이 된다.

<br>


자바의 경우, 항상 **call by value**로 값을 넘긴다.

#### 정리

Call by value의 경우, 데이터 값을 복사해서 함수로 전달하기 때문에 원본의 데이터가 변경될 가능성이 없다. 하지만 인자를 넘겨줄 때마다 메모리 공간을 할당해야해서 메모리 공간을 더 잡아먹는다.

Call by reference의 경우 메모리 공간 할당 문제는 해결했지만, 원본 값이 변경될 수 있다는 위험이 존재한다.