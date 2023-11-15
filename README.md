<!-- TOC -->

* [로또](#로또)
  * [진행 방법](#진행-방법)
  * [온라인 코드 리뷰 과정](#온라인-코드-리뷰-과정)
  * [Step1](#step1)
    * [프로그래밍 요구사항](#프로그래밍-요구사항)
    * [기능목록](#기능목록)
    * [추가 피드백 사항](#추가-피드백-사항)
  * [Step2](#step2)
    * [프로그래밍 요구사항](#프로그래밍-요구사항-1)
    * [기능목록](#기능목록-1)
    * [추가 피드백 사항](#추가-피드백-사항-1)
  * [Step3](#step3)
    * [프로그래밍 요구사항](#프로그래밍-요구사항-2)
    * [기능목록](#기능목록-2)
    * [추가 피드백 사항](#추가-피드백-사항-2)
  * [Step4](#step4)
    * [프로그래밍 요구사항](#프로그래밍-요구사항-3)
    * [기능목록](#기능목록-3)

<!-- TOC -->

# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

## Step1

### 프로그래밍 요구사항

- indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.[method가 한 가지 일만 하도록 최대한 작게 만들어라.]
- else를 사용하지 마라.

### 기능목록

- `사용자가 입력한 문자열 값`에 따라 `사칙연산을 수행할 수 있는 계산기를 구현`해야 한다.
  - [X] ~~덧셈~~
  - [X] ~~뺄셈~~
  - [X] ~~곱셈~~
  - [X] ~~나눗셈~~
  - [X] ~~입력 값이 `null`이거나 `빈 공백` 문자일 경우, `IllegalArgumentException` 예외 발생~~
  - [X] ~~`사칙연산 기호`가 아닌 경우, `IllegalArgumentException` 예외 발생~~
  - [X] ~~`사칙 연산을 모두 포함`하는 기능 구현~~
- [X] ~~입력 문자열의 숫자와 사칙 연산 사이에는 `반드시 빈 공백 문자열이 있다고 가정`한다.~~
- [X] ~~나눗셈의 경우, `결과 값을 정수로 떨어지는 값으로 한정`한다.~~
- [X] ~~문자열 계산기는 사칙연산의 계산 우선순위가 아닌 `입력 값에 따라 계산 순서가 결정`된다.~~
  - 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
  - 예를 들어 `2 + 3 * 4 / 2`와 같은 문자열을 입력할 경우, `10`을 출력해야 한다.

### 추가 피드백 사항

- 23.11.11
  - [X] ~~Operator에서 abstract 메서드를 상속받아 사용하는 것 대신에 람다식으로 표현을 해보자.~~
  - [X] ~~Operator::findBySymbol 의 테스트를 추가하자.~~

---

## Step2

### 프로그래밍 요구사항

- indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
- 메소드의 크기가 최대 15라인을 넘지 않도록 구현한다.[method가 한 가지 일만 하도록 최대한 작게 만들어라.]
- else를 사용하지 마라.
- Java 코드 컨벤션을 지킨다.
- 모든 기능을 TDD로 구현한다. (UI 로직 제외)
  - 모든 로직에 단위 테스트를 구현한다.

### 기능목록

- 로또 1장의 가격을 1000원으로 설정한다.
- 로또 구입 금액을 입력하면, 구입 금액에 해당하는 로또를 발급한다.
  - [X] ~~로또 구입 금액을 입력한다.~~
  - [X] ~~로또 구입 금액이 0이하면 IllegalArgumentException이 발생한다.~~
  - [X] ~~구입 금액을 로또 가격에 맞춰서 구매 수량을 정한다.~~
  - [X] ~~구매 수량에 맞춰서 로또를 발급한다.~~
  - [X] ~~발급한 로또를 화면에 출력한다.~~
  - [X] ~~로또를 발급할때, 각 로또마다 1이상 45이하의 6개의 번호를 중복되지 않게 가지도록 한다.~~
  - [X] ~~로또 번호 6개는 오름차순으로 정렬이 되어있도록 한다.~~
  - [X] ~~각 로또는 발급될 때, 로또 번호가 1이상 45이하의 6개의 번호를 가지고 있는지 확인한다.~~
  - [X] ~~로또가 화면에 출력될 때 본인이 가지고 있는 숫자들을 표시한다.~~
- 당첨 번호를 확인한다.
  - [X] ~~지난 주 당첨 번호를 입력한다.~~
    - 쉼표 + 공백 (", ")를 통해서 번호를 구분한다.
  - [X] ~~당첨 번호는 1이상 45이하의 6개의 번호를 중복되지 않게 가지도록 한다.~~
- 당첨 통계를 구한다.
  - [X] ~~발급한 로또가 당첨 번호와 몇개 일치 했는지 구한다.~~
  - [X] ~~당첨 통계를 화면에 출력한다.~~
    - 3개 일치, 4개 일치, 5개 일치, 6개 일치 : 일치 수량에 맞춰서 각각 몇개 인지 화면에 출력한다.
  - [X] ~~현재 당첨 통계를 기준으로 총 상금을 구한다.~~
  - [X] ~~수익률을 구한다.~~
    - 수익률 = 총 당첨금 / 구입금액
  - [X] ~~수익률을 화면에 출력한다.~~

### 추가 피드백 사항

- 23.11.12
  - [X] ~~로또 최소 금액이 1000원이기 때문에 1000원 미만의 금액을 입력했을 경우, 진행하지 못 하도록 막아보기~~
  - [X] ~~static으로만 구성된 클래스는 외부에서 인스턴스 생성을 막을 수 있게 생성자에 private 적용~~
  - [X] ~~패키지 재분류 (util -> service)~~
  - [X] ~~Collections.unmodifiableSet 를 이용하여, Lotto 클래스의 번호들을 수정할 수 없도록 하기~~
  - [X] ~~lottoRank에서 count 값 비교하는 부분을 메서드 추출하기.~~
  - [X] ~~로또 번호를 하나의 객체로 생각하고 추출하기.~~

---

## Step3

### 프로그래밍 요구사항

- Step2의 요구사항을 유지
- Java enum을 사용한다.
- 객체 지향 생활 체조 규칙 8: 일급 콜렉션을 쓴다.

### 기능목록

- [X] ~~2등을 위해 추가 번호를 하나 더 추첨한다.~~
- [X] ~~당첨 통계에도 2등을 추가한다.~~

### 추가 피드백 사항

- 23.11.13
  - [X] ~~throwExceptionIfValueIsNotValid의 parameter 확인~~
  - [X] ~~LottoRank가 가지는 인스턴스 변수가 많아졌다. 축소가 가능한지 확인~~
  - [X] ~~LottoRank 생성자에서 final을 붙이는 parameter 확인~~
  - [X] ~~matchLottos() 메서드의 역할을 로또 객체에게 시키는 것이 가능한지 확인~~
  - [X] ~~validateSize가 중복해서 수행된다. 어떻게 처리하면 좋을지 고민~~
  - [X] ~~Set<LottoNumber>는 결국 Lotto 객체인 것 같다. Lotto 객체를 관리하도록 변경~~
  - [X] ~~사용하지 않는 NumberValidatorTest 삭제~~
  - [X] ~~여러 검증을 사용하는 경우, assertAll을 사용해보자 [`SoftAssertions.assertSoftly`]~~

---

## Step4

### 프로그래밍 요구사항

- Step3의 요구사항을 유지
- 객체 지향 생활 체조 규칙 3: 모든 원시값과 문자열을 포장한다.
- 객체 지향 생활 체조 규칙 5: 줄여쓰지 않는다(축약 금지).
- 예외 처리를 통해 에러가 발생하지 않도록 한다.
  - 사용자가 잘못된 값을 입력했을 때 java exception으로 에러 처리를 한다.
  - java8에 추가된 Optional을 적용해 NullPointerException이 발생하지 않도록 한다.

### 기능목록

- [X] ~~matchLottos 메서드에서 WinnerNumbers 객체와 Lotto가 서로 양방향 의존인데, 단방향으로 처리할 것~~
- [X] ~~사용자가 수동으로 구매할 로또 수를 입력하게 한다.~~
- [X] ~~사용자가 수동으로 구매할 로또 수를 입력시 예외 처리를 추가한다.~~
- [X] ~~사용자가 수동으로 로또 번호를 입력할 수 있게 한다.~~
- [X] ~~사용자가 수동으로 로또 번호 입력시 예외 처리를 추가한다.~~
- [X] ~~사용자가 당첨 번호 입력시 예외 처리를 추가한다.~~
- [ ] 사용자가 보너스 볼 입력시 예외 처리를 추가한다.

---
