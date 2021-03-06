### 정의
* 마이크로소프트 윈도우를 사용하는 서버들을 위한 인터넷 기반 서비스들의 모임.
* 실사용률 약 7% (아파치 45%, 엔진엑스 20%, 구글 웹 서버 8%)
* 서버는 현재 FTP, SMTP, NNTP, HTTP/HTTPS 를 포함.

### IIS의 역사
* 처음에 윈도우 NT 3.51용 인터넷 기반 서비스의 부가적인 기능으로 공개.
* IIS 2.0은 윈도우 NT 4.0 운영체제에 대한 지원을 추가.
* IIS 3.0은 액티브 서버 페이지의 동적인 스크립트 환경을 도입.
* IIS 4.0은 고퍼 프로토콜에 대한 지원을 끊고 별도의 옵션팩 CD-ROM으로 윈도우 NT에 번들 추가
* IIS 7.0은 윈도우 서버 2008에 끼워팔고 있음
* IIS 10.0이 윈도우10 과 함께 나옴(윈도우 서버 2016)

### 왜 필요한가?
* ASP, ASP.NET을 사용할 경우
* 윈도우 서버로 제한되거나 아파치를 사용할 필요가 없을 경우. 그러나 현재 웹에서 적용되는 서비스 대부분이 아파치나 엔진엑스 서버를 사용하고 있는 걸 봐서 윈도우 서버를 활용하는 것이 좋은 경우는 그닥 없는 듯 하다.
* 응용 프로그램이 마이크로소프트 기반일 경우(파일공유, SQL서버, Exchange 서버 등)

### 그래도 장점
* 다른 사용자 컨텍스트에서 실행되도 응용 프로그램 분리를 위해 IIS를 사용하면 디렉터리 및 파일별  suexec-type을 간편하게 구성 가능.
* 웹 요청을 통해 SQL Server와 같은 네트워크 리소스에 사용자 인증을 안전하게 통합하기 위해 MSDTC, MSMQ 및 파일 공유가 가정.(고유한 장점이 있음)
> 솔직히 뭔 소린지 모르겠음

* 설치 및 유지 관리가 쉽다. 플랫폼과 유사하기 때문.


### 참고한 사이트
* https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%EB%84%B7_%EC%A0%95%EB%B3%B4_%EC%84%9C%EB%B9%84%EC%8A%A4
* https://serverfault.com/questions/231291/why-do-people-use-iis
* https://searchwindowsserver.techtarget.com/definition/IIS
