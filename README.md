## 학원 공부 내용 정리

### 시작
---
### JDK 설치
[Oracle.JDK.downloads](https://www.oracle.com/kr/java/technologies/downloads/)

### Java IDE 설치
[JavaIDE.downloads](https://www.eclipse.org/downloads/)

### 시스템 환경 변수 설정

* 찾기 -> 시스템 환경 변수 편집 -> 환경변수 탭 -> 새로만들기 탭 -> 변수이름 : JAVA_HOME 변수 값 : 설치경로 -> 확인
* 변수 항목 Path를 찾고 편집 -> %JAVA_HOME%\bin 추가하고 상위로 올린다.
---

## 변수

* 변수란, "단 하나의 값을저장할 수 있는 메모리 공간"이다.
``` java
int num = 0;
// 정수 0 이 int타입의 이름을 가진 변수 num에 담긴다.
```

### 리터럴

* 타입

|종류|리터럴|접미사|
|---|-----|---|
|논리형|false,true|없음|
|정수형|123,0b0101,077,0xFF,100L|L|
|실수형|3.14,3.0e8,1.4f|f, d|
|문자형|'A', '1', \'\n\'|없음|
|문자열|"ABC", "123", "A", "true"|없음|

### 기본형의 종류

|종류/크기|1byte|2byte|4byte|8byte|
|---|---|---|---|---|
|논리형|boolean| | | |
|문자형| |char| | |
|정수형|byte|short|int|long|
|실수형| | |float|double|
---
##  연산자
* 주어진 변수나 리터럴에 대해 연산을 수행하기 위한 것이다.

### 증감 연산자 (++, --)
* 증가 연산자(++) : 피연산자의 값을 1 증가시킨다.
* 감소 연산자(--) : 피연산자의 값을 1 감소시킨다.

### 비교 연산자 (<, >, >=, <=)

|비교연산자|연산결과|
|---|---|
|>|좌변 값이 크면, true 아니면 false|
|<|좌변 값이 작으면, true 아니면 false|
|>=|좌변 값이 크거나 작으면, true 아니면 false|
|<=|좌변 값이 크거나 작으면, true 아니면 false|

### 등가비교 연산자 ( == != )

|비교연산자|연산결과|
|---|---|
|==|두 값이 같으면, true 아니면 false|
|!=|두 값이 다르면, true 아니면 false|

### 논리연산자 (&&, ||)
* && : 피연산자 양쪽 모두 true 일 때 true를 결과로 얻는다.
* || : 피연산자 중 어느 한 쪽이 true 일 때 true를 결과로 얻는다.
```java
if(true&&true)  // true
if(true&&false) // false
if(false&&true)  // false
if(false&&false) // false
```
```java
if(true||true)  // true
if(true||false) // true
if(false||true) // true
if(false||false) // false
```

### 논리 부정 연산자 ( ! )
* 피연산자가 true이면 false, false이면 true를 반환한다.

### 삼항연산자
* 조건식,식1,식2 모두 세 개의 피연산자를 필요로 하는 삼항연산자, 삼항연산자는 조건 연산자 하나뿐이다.
* 조건식의 결과가 true일 때 식1, false일 때 식2 를 반환한다.
`(조건식) ? 식1 : 식2`
---
## 제어문(조건문)
* 프로그램 내에서 주어진 표현식의 결과에 따라 별도의 명령을 수행하도록 제어하는 실행문이다.

#### 조건문의 다양한 예

|조건식|	조건식이 참일 조건|
|---|---|
|90 <= x && x <= 10|0	정수 x가 90이상 100이하일 때|
|0 < x \|\| x > 100	정수|x가 0보다 작거나 100보다 클 때|
|x%3==0 && x%2 !=0|정수 x가 3의 배수지만, 2의 배수가 아닐 때|
|ch == 'y' \|\| ch =='Y'|문자 ch가 'y' 또는 'Y'일 때|
|ch == ' ' \|\| ch == '\t' \|\| ch == '\n’ |문자 ch가 공백이거나 탭 또는 개행 문자일 때|
|'A' <= ch && ch <= 'Z'|문자 ch가 대문자일 때|
|'a' <= ch && ch <= 'z'|문자 ch가 소문자일 때|
|'0' <= ch && ch <= '9'|문자 ch가 숫자일 때|
|str.equals("yes")|문자열 str의 내용이 'yes'일 때(대소문자 구분)|
|str.equalsIgnoreCase("yes")|문자열 str의 내용이 'yes'일 때(대소문자 구분안함)|

### if문
* if : `if (value == 0) { ... };' 조건식이 true면 수행문이 출력 false면 출력되지 않는다.
* else if : 자유롭게 제어를 할 수 있다.
```java
if (false) {
				System.out.println(1);
			} else if (true) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
      // 첫 조건식이 true면 수행문을 수행하고, 아니면 그 다음 조건식으로 넘어간다. 
```
```java
// 조건문 중첩을 활용한 구구단
if(int i = 2; i < 10; i++) {
  if(int j = 1; j < 10; j++) {
    System.out.println(i+" * "+ j + " = " + (i*j));
  }
}
```
