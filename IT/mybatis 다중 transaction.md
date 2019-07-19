# mybatis 다중 transaction 

기본적으로 datasource에 관련된 id와 ref를 바꿔주면 된다. 기존과 곂치지 않게 name도 조심해서 설정하자.

https://hellogk.tistory.com/97

올바른 driverClassName 

jdbc:oracle:thin:@myserver:1521/XE

잘못된 driverClassName 

jdbc:oracle:thin:@myserver:1521:XE

출처 : https://stackoverflow.com/questions/18192521/ora-12505-tnslistener-does-not-currently-know-of-sid-given-in-connect-descript#