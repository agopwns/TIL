# 2018-10-16 오늘 배운 것.

# SSH Protocol

### SSH
* Secure Shell의 약자
* 네트워크 상의 다른 컴퓨터에 로그인하거나 원격 시스템에서 파일을 복사할 수 있게 해주는 프로토콜
* VPN 구성보다 저렴해 많이 사용

### Authentication(인증)
* public key와 private key를 사용
* private key 는 각자 가지고 있다가 public key만 네트워크를 통해 전달 후 확인하는 방식
* RSA, DSA 등 다양한 인증 방식 지원

### Encryption(암호화) & Integrity(무결성)
* SSH는 네트워크를 통해 전달되는 데이터를 암호화
* 3DES, blowfish 등 여러 가지 암호화 방식 제공
* 무결성을 위해 MAC(Message Authentication Code) 알고리즘 적용
  - SSH 클라이언트 -> 서버
  - MAC 알고리즘을 통해 secret key를 받아 MAC 코드 생성
  - 임의 길이의 암호화된 메세지와 MAC코드를 SSH서버로 전송
  - 서버에서는 secret key를 조합하여 MAC코드를 만듬
  - 클라이언트로 받은 MAC코드와 비교하여 인증

### Compression(압축)
* 데이터 압축 과정이 있음
* 따라서 네트워크 비용도 감소
