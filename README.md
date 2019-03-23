# BlockChain

### 정보보안의 3가지 요소
#### CIA
- 기밀성(confidentiality) : data에 접근할 수 있는 것.
- 무결성(integrity) : data를 정상인 상태로 유지하는 것.
- 가용성(Available) : Service가 항상 원할하게 제공되게 하는 것.

무결성을 유지하기 위한 것 -> Hash
Password -> Hash -> DataBase

<br>

## Hash Algorithm
#### origin data -> hash -> data(고정길이)
원래의 data가 조금만 바뀌어도 고정길이의 데이터는 완전히 바뀐다.(눈사태 효과)

<br>

#### 대표적인 hash algorithm
- MD5 : 32자리의 16진수 값으로 바꿔준다.
- SHA-512 : 대표적인 hash algorithm

Software가 정품인지 확인할 때 hash값을 이용하여 확인할 수 있다.

<br>

#### Hash의 한계점
- 128bit -> 2^128가지 경우의 수 -> 이중에 하나를 무작위로 추출한다.
- 매우 큰 수 이지만 무한대는 아니다(동일한 값이 나올 수 있다.)

##### 비둘기집의 원리
비둘기 집이 4개이고 비둘기는 5마리가 있다. 고로 최소한 두마리는 같은 집에 들어가야 한다.
N+1개의 물건을 N개의 상자에 넣고자 할 때 최소한 한 상자에는 두개의 물건을 넣어야 한다는 원리

- 어떠한 hash algorithm이라도 동일한 값이 존재할 수 있다.(희박한 확률), 따라서 충돌이 적게 발생할 수록 좋은 hash algorithm이다.

<br>

#### Hash의 장점
- 해쉬는 복화가 불가능하다.(출력값을 가지고 입력값을 유추하는 것은 불가능하다.
- SALT : 원본값을 찾아내기 어렵게 추가하는 데이터(ex: String)
