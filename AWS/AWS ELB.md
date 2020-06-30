### load balancing 부하 분산이란?
> load 짐, 싣다 + balancing 분산  

<img src="https://ko.wikipedia.org/wiki/%EB%B6%80%ED%95%98%EB%B6%84%EC%82%B0#/media/%ED%8C%8C%EC%9D%BC:Elasticsearch_Cluster_August_2014.png" alt="LoadBalancerExample" width="99%"/> 

싣는 것을 분산한다. 짐(부하)을 분산한다 로 해석이 가능하며 IT관점에서는 CPU, 저장장치의 컴퓨터 자원을 분산한다는 개념으로 볼 수 있다.

### 사용 이유
- 부하 분산을 통해 병렬처리가 가능해져 가용성과 응답시간의 최적화가 가능
- 보안 측면에서 내부 네트워크 구조를 숨기기 때문에 크래킹 방지
- 서버 다운, 백업 등의 경우 안정성을 부여

### ELB(Elastic Load Balancer)
유연한 부하 분산을 의미하며 트래픽이 접근 했을 때 가장 먼저 받는 진입점 역할을 하여 분산한 트래픽을 각 서버에게 나눠준다.

- 트래픽 분산
- 자동 확장(Scale Out)을 지원하기 때문에 신경 쓸 것이 적음
- 인스턴스를 감지해 오류가 있는 시스템은 배제
- 사용자 세션을 특정 인스턴스에 고정하여 자원 낭비를 막음
- SSL 암호화 지원
- IPv4, IPv6 지원
- Cloud Watch를 통한 모니터링 