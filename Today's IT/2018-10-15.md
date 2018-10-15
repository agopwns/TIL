# 2018-10-15 오늘 배운 것.

# HTTP 프로토콜

### HTTP
* Tim Nerners-Lee가 URL, HTTP, HTML을 설계
* 인터넷 상에서 데이터를 주고 받기 위한 서버/클라이언트 모델을 따르는 프로토콜
* 어플리케이션 레벨로 TCP/IP 위에서 작동
* 어떤 종류의 데이터든 전송 가능



### 작동 방식

* 클라이언트에서 request를 보내면 response한다
* 클라이언트는 chrome, firefox, ie 등의 소프트웨어를 이용
* 서버는 클라이언트의 요청을 받아 해석하고 응답하는 소프트웨어가 설치된 컴퓨터
  Apache, nginx, IIS, lightpd 등이 서버 소프트웨어



### Connectless & Stateless

* 서버에 연결, 요청 응답 후 연결 끊음
* 자원 하나에 대해 하나의 연결만 만듬
* 장점 : 불특정 다수를 대상으로 하는 서비스에 적합
* 단점 : 연결을 끊어 클라이언트의 이전 상태를 모름
* 단점 해결을 위해 쿠키 사용
  - 쿠키는 따로 알아보자!



### URI (Uniform Resource Identifiers)

* 웹브라우저는 URI를 이용하여 자원의 위치를 찾음
* URI와 HTTP는 서로 다른 독립된 체계
* http://www.example.com/index.php를 예로 들면
  www.example.com이 위치(도메인은 ip로 변환)
  index.php가 요청할 자원의 이름



### Method

* 메서드는 요청의 종류를 서버에게 알려주는 역할
* GET - 정보 요청 (SELECT)
* POST - 정보 삽입 (INSERT)
* PUT - 정보 업데이트 (UPDATE)
* DELETE - 정보 삭제 (DELETE)
* HEAD - 헤더 정보 요청. 자원 혹은 서버에 문제를 확인하기 위함
* OPTIONS - 웹서버가 지원하는 메서드 종류 요청
* TRACE - 클라이언트의 요청을 그대로 반환
  echo 서비스로 서버 상태를 확인하기 위한 목적으로 사용
* 보통 GET, POST만으로도 모든 종류의 요청을 표현 가능해서 그대로 개발하는 경우가 많음
* CRUD에 맞게 개발하려면 RESTful하게 개발하는 것이 올바름



### 요청 데이터 포맷
```
1 GET /cgi-bin/http_trace.pl HTTP/1.1\r\n
2 ACCEPT_ENCODING: gzip,deflate,sdch\r\n
3 CONNECTION: keep-alive\r\n
4 ACCEPT: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n
5 ACCEPT_CHARSET: windows-949,utf-8;q=0.7,*;q=0.3\r\n
6 USER_AGENT: Mozilla/5.0 (X11; Linux i686) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.24\r\n
7 ACCEPT_LANGUAGE: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4\rn
8 HOST: www.joinc.co.kr\r\n
9 \r\n
```
* 웹브라우저는 웹서버에 데이터를 요청하는 클라이언트 프로그램
* 요청은 서버가 인식할 수 있는 HTTP형식을 따라야 함
* 요청은 요청메서드, 요청 URI, HTTP 프로토콜 버전으로 3개의 필드로 이루어짐
* 요청 메서드 - GET, PUT, POST, PUSH, OPTIONS 등
* 요청 URI - 요청하는 자원의 위치 명시
* HTTP 프로토콜 버전 - 웹브라우저가 사용하는 프로토콜 버전
