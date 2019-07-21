# Class란 뭘까?

객체지향에서 흔히 중요한 개념으로 여겨지는 클래스.. 몇 번이고 공부 했던 클래스인데 지금 와서 보니 오히려 조금 생소하게 느껴지기도 한다. 이번 기회에 조금 더 깊이 알아보자.

### Class의 사전적 의미

일반적인 사전적 의미로는 1.학급(학생들) 2.수업(강의) 3.(한 주제에 대한 연속적인) 수업 그리고 계급이라는 의미가 있는데 이것과는 좀 다르다. FORTRAN(과학 기술 계산용으로 쓰이는 고급 컴퓨터 언어) 용어에서는 '부류'라고 해석되는데 이 의미가 OOP에서 사용되는 의미와 가장 가까워보인다.

OOP에서는 변수와 메서드를 정의할 때 사용되는 템플릿. 즉, 붕어빵 틀과 같은 역할을 한다.

### class는 왜 필요한가?

프로그래밍에서 중복의 제거는 매우 중요한데 OOP의 등장 전에는 메서드를 사용함으로써 코드 길이가 줄어들었지만 정작 변수와 메서드의 중복을 해결하지 못했다. 따라서, 연관성이 있는 변수와 메서드를 미리 정의하고 중복을 제거하여 효율적으로 사용하기 위해 클래스라는 개념이 탄생하게 되었다.

### class는 어떻게 사용하는가?

자바 코드로 간단하게 표현 해보자.

class Calculator{
    
    // 해당 클래스 안에 쓰이는 변수. 즉, 멤버변수이다
    int left, right;

    public void setValue(int left, int right){
        this.left = left;
        this.right = right;
    }

    // 중복되는 함수를 미리 정의한다
    public void sum(){
        System.out.println(this.left + this.right);
    }

    // 이렇게 미리 정의된 함수는 편의에 따라 골라서 사용할 수 있다
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}

// 실제 사용 되는 부분

public class CalculatorDemo{

    public static void main(String[] args){

        Calculator c1 = new Calculator(); // 객체 생성
        c1.setValue(10, 20); // setValue함수를 통해 left, right 값을 할당
        System.out.println(c1.sum()); // 결과 30
        System.out.println(c1.avg()); // 결과 15

    }

}