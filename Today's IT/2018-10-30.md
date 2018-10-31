# 2018-10-30 TIL

### WebServer / WAS(Web Aplication Server) 의 차이
간단하게 설명하면 WebServer(이하 웹서버)는 정적 처리를 담당하며 WAS는 동적 처리를 담당한다. 따라서 정적인 페이지(HTML, CSS, IMG, javascript files 등)는 웹서버에서 처리하고 동적인 처리(비즈니스로직, DB접속 등)는 WAS에서 담당한다.

### 정적 vs 동적 컨텐츠
정적인 것은 있는 그대로 제공되는 것. 동적인 것은 서버가 컨텐츠를 처리하는 것. 혹은 컨텐츠를 DB로부터 생성하는 것을 의미. ex) MSDN은 수천개의 페이지를 가지고 있지만 실제론 약간의 HTML과 DB로부터 동적 페이지를 생산해낸다.  

### 웹서버 종류
* Apache
* IIS

### WAS 종류
* Tomcat
* BEA WebLogic
* IBM WebSphere
* SUN iPlanet
* Oracle 9iAS
* jeus (킹갓국산)
