## 더자바 시리즈로 공부하는 자바 활용법들

### 1. 함수형 인터페이스<hr>
 #### 자바에서 제공하는 함수형 인터페이스 : 
**Function<T, R>**

- T 타입을 받아서 R타입을 리턴하는 함수 인터페이스
    - R apply(T t)
- 함수 조합용 메소드
    - andThen
    - compose


**BiFunction<T, U, R>**

- 두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
    - R apply(T t, U u)


**Consumer<T>**

- T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
    - void Accept(T t)
- 함수 조합용 메소드
    - andThen

**Supplier<T>**

- T타입의 값을제공하는 함수 인터페이스
    - T get()

**Predicate<T>**

- T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
    - boolean test(T t)
- 함수 조합용 메소드
    - And
    - Or
    - Negate

**UnaryOperator<T>**

- Function<T,R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스

**BinaryOperator<T>**

- BiFunction<T,U,R>의 특수한 형태로, 동일한 타입의 입력값 두개를 받아 리턴하는 함수 인터페이스