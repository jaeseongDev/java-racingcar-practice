# java-racingcar
자동차 경주 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

### 기능 구현 목록
- [ ] 경주할 자동차 이름 입력 받기
    - [ ] 자동차 이름을 쉼표(,)를 기준으로 분리하기
    - [ ] 자동차 이름을 쉼표(,)로 분리한 후 양쪽 공백 없애기
    - [x] [예외] 쉼표로 분리하고 양쪽 공백을 제거한 뒤, 자동차 이름은 1~5자만 가능하다.
    - [ ] [예외] 경주할 자동차는 2대 이상이어야 한다.
- [ ] 시도할 횟수 입력 받기
    - [ ] [예외] 숫자 이외의 값을 받을 경우 예외 발생 
    - [ ] [예외] 1 이상의 숫자여야만 한다.
- [ ] 한 번의 시도마다 전진 또는 정지하기
    - [ ] 랜덤값 생성하기
    - [ ] 랜덤값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- [ ] 실행 결과 출력하기
    - [ ] 각 시도별 움직인 결과 저장하기
- [ ] 우승자 출력하기
    - [ ] 전체 시도에서 마지막 시도를 바탕으로 우승자 가려내기