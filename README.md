# java-lotto-precourse

# 로또

## 기능 소개

- 구매 금액과 당첨 금액을 입력 받고 당첨내역과 수익률을 알려주는 로또발매 서비스
    - 로또 번호의 숫자 범위는 1~45
    - 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자 뽑기
    - 로또 1장의 가격은 1,000원

## 패키지 구조

- domain
- vew

## 기능 목록

- [ ] 당첨 내역 통계
- [ ] 수악률을 계산

### 입력

- [ ] 구매 금액 입력
    - [ ] 입력 받은 값이 숫자가 아니면 예외처리
    - [ ] 구매 금액이 로또 가격보다 작으면 예외처리
    - [ ] 구매 금액이 로또 가격과 정확히 나누어 떨어지지 않으면 예외처리
- [ ] 당첨 번호 입력
    - [ ] 입력 받은 값이 숫자가 아니면 예외처리
    - [ ] 숫자의 범위가 1~45가 아니면 예외처리
    - [ ] 중복 되는 숫자가 있으면 예외처리
- [ ] 보너스 번호 입력
    - [ ] 입력 받은 값이 숫자가 아니면 예외처리
    - [ ] 숫자의 범위가 1~45가 아니면 예외처리
    - [ ] 당첨 번호와 중복 되는 숫자가 있으면 예외처리

### 출력

- [ ] 구매한 로또 번호 출력
- [ ] 당첨 통계 출력
- [ ] 수익률 출력