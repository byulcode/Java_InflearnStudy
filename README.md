## 더자바 시리즈로 공부하는 자바 활용법들

### 1. 함수형 인터페이스<hr>
 #### 자바에서 제공하는 함수형 인터페이스 - Functional.java
**Function<T, R>**

- T 타입을 받아서 R타입을 리턴하는 함수 인터페이스

**BiFunction<T, U, R>**

- 두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스


**Consumer< T >**

- T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스

**Supplier< T >**

- T타입의 값을제공하는 함수 인터페이스
    - T get()

**Predicate< T >**

- T 타입을 받아서 boolean을 리턴하는 함수 인터페이스

**UnaryOperator< T >**

- Function<T,R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스

**BinaryOperator< T >**

- BiFunction<T,U,R>의 특수한 형태로, 동일한 타입의 입력값 두개를 받아 리턴하는 함수 인터페이스

### 2. 람다 표현식 - LambdaPractice.java <hr>

* 로컬과 익명 클래스는 변수 쉐도윙 가능. but 람다는 람다를 감싸고 있는 스콥과 같아서 변수 쉐도윙 불가능. 
* effective final : "사실상" final인 변수. final 키워드를 사용하지 않아도 변수값이 바뀌지 않으면 final로 취급 가능. but 변수값이 바뀌면 참조 불가.

#### 메소드 레퍼런스 - Greeting.java, App.java
+ 람다 표현식을 더 간단하게 표현하는 방법 (콜론 두개 ::)

### 3. 인터페이스 기본 메소드와 static 메소드<hr>