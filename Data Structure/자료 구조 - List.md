# List란?

리스트는 수학적으로 유한 수열을 프로그래밍적으로 표현한 것이다. List를 이해하는데 가장 중요한 두 가지는 순서대로 저장된다는 것과 중복을 허용한다는 것이다. 


### Array vs List

배열의 경우 인덱스가 매우 중요하다. 인덱스만 알고 있으면 빠르게 데이터에 액세스하여 값을 가져 올 수 있기 때문이다.

리스트의 경우에도 인덱스가 있지만 데이터의 저장 순서가 훨씬 중요하게 여겨진다. 배열의 경우 엘리먼트가 삭제 되었을 때 빈 공간을 남겨두어 메모리 낭비를 초래하지만 리스트는 인덱스의 장점을 버리는 대신 빈틈없는 데이터의 적재라는 장점을 부각시킨 자료 구조이다.


### 리스트의 기능

리스트의 핵심 개념은 순서가 있는 엘리먼트의 모임이라는 것이다. 앞서 말한 빈 엘리먼트가 허용되지 않는다는 점도 중요하다. 

일반적으로 리스트는 아래와 같은 기능을 제공한다.

처음, 끝, 중간에 엘리먼트를 추가/삭제하는 기능
리스트에 데이터가 있는지 체크하는 기능
리스트의 모든 데이터에 접근할 수 있는 기능


### 언어 자체에 내장된 리스트

오래된 언어 중 하나인 C는 배열은 있지만 리스트가 없어 개발자들이 직접 구현해서 사용하였다. 최근에 등장한 언어의 창시자들 혹은 그것을 계속 개발하는 사람들은 리스트의 중요성을 알고 있었고 언어 자체에서 대부분 지원하게 되었다. 

그러나 확실히 알아야 할 것은 리스트를 제공한다고 해도 언어별로 그 방식이나 구성이 다를 수 있다는 점이다. 여러 언어를 살펴보면서 차이점을 알아보자.

자바스크립트의 경우 배열에 리스트 기능을 포함하고 있다. 아래는 인덱스 3을 제거하는 코드이다.


numbers = [10, 20, 30, 40, 50];
//인덱스 3의 값을 제거
numbers.splice(3,1);
for(i = 0; i < numbers.length; i++){
console.log(numbers[i]);
}


실행 결과는 아래와 같다.

10
20
30
50

자바스크립트나 파이썬 같은 스크립트 언어가 추구하는 가치는 '쉽다'이다. (물론 요즘은 워낙 스크립트 언어가 다양해서 쉽다라고 하기도 애매하긴 하다) 리스트에 대한 효용은 어떤 언어와 해당 언어 내에서 제공하는 어떤 리스트를 쓰는지에 따라 달라진다. 이번엔 자바의 경우를 알아보자.


### 자바에서의 리스트

두 가지 형태의 리스트를 보자.

ArrayList numbers = new ArrayList();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.remove(3);
System.out.println(numbers);


LinkedList numbers = new LinkedList();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
numbers.remove(3);
System.out.println(numbers);

이 두 가지 리스트는 추가하는 방식이나 결과는 같다. 그럼 단순히 이름만 다른 리스트를 만들 필요가 없지 않은가? 맞다. 기본적으로 둘다 리스트이지만 내부 동작이 다르다.

Array List는 추가/삭제는 느리지만 인덱스 조회는 빠르다. Linked List는 반대로 추가/삭제는 빠르지만 인덱스 조회는 느리다. 이러한 차이점을 알기 위해서는 자료 구조를 직접 구현해서 사용하지는 않더라도 내부적인 메커니즘을 이해할 수 있어야 한다. 100개, 1000개의 데이터가 있을 땐 상관 없지만 만약 100만개, 1000만개, ... 처럼 굉장히 큰 데이터를 다뤄야 한다면 이 작은 부분에서 엄청난 차이가 발생할 것이다.


직접 실행해본 결과 LinkedList는 조회가 굉장히 느리다. 조회가 많은 로직이라면 반드시 Array List를 활용해야 한다.

// addArray 결과 약 5초
start = System.currentTimeMillis();
for (int i = 0; i < 10000000; i++) {
    arrayList.add(i);
}
end = System.currentTimeMillis();
System.out.println( "addArray 실행 시간 : " + ( end - start )/1000.0 );

// getArray 결과 약 0.05초
start = System.currentTimeMillis();
for (int i = 0; i < arrayList.size(); i++) {
    arrayList.get(i);
}
end = System.currentTimeMillis();
System.out.println( "getArray 실행 시간 : " + ( end - start )/1000.0 );

// addLinked 결과 약 1.5초
start = System.currentTimeMillis();
for (int i = 0; i < 10000000; i++) {
    linkedList.add(i);
}
end = System.currentTimeMillis();
System.out.println( "linkedAdd 실행 시간 : " + ( end - start )/1000.0 );

// getLinked 결과 100분의 1인데도 약 15~25초
start = System.currentTimeMillis();
for (int i = 0; i < 100000; i++) {
    linkedList.get(i);
}
end = System.currentTimeMillis();
System.out.println( "getLinked 실행 시간 : " + ( end - start )/1000.0 );