# Linked List란?

Linked List를 이해하는 가장 쉬운 방법은 '연결'이라는 키워드를 이해하는 것이다.


### Likned List vs Array List

RAM은 어느 공간에 접근하든 항상 속도가 일정하다. 다만, 주소를 알아야 하기 때문에 찾는 과정이 많다면 Linked List의 경우처럼 a를 찾고

b는 어딨니? -> b찾고 -> c는 어딨니? -> c ... 와 같은 작업이 반복되어 속도가 느려진다.

반대로 Array List의 경우 한 라인에 있기 때문에 주소를 묻는 과정이 필요없어 조회속도가 빠르지만 만약 새로운 공간을 사용해야 할 때는 크기를 전부 늘려야 하므로 속도가 오래 걸릴 경우가 있다. 반면, Linked List는 빈 공간 아무 곳에나 추가하면 되기 때문에 속도가 빠르다.

이런 이유 때문에 Array List는 조회 속도가 빠르고 Linked List는 삽입/삭제가 빠르다.


### Linked List의 구조

Linked List에서 리스트는 노드(or vertex)들의 모임이다. 노드는 최소한 두 개의 속성이 필요하다. value에는 값이 저장되고 next에는 다음 노드의 포인터나 참조값을 저장해서 노드와 노드를 연결시킨다.

Head는 해당 리스트를 활용하기 위한 가장 첫 번째 노드를 뜻한다.


### List 노드 추가

Vertex temp1 = head
while (--k!=0)
  temp1 = temp1.next
Vertex temp2 = temp1.next
Vertex newVertex = new Vertex(input)
temp1.next = newVertex
newVertex.next = temp2

만약 6과 23 사이에 90이라는 수를 추가하여야 한다면 위와 같은 코드를 가진다.

1. temp1에 head인 15를 저장
2. k = 2로 초기화 되어있어서 15의 next인 6을 찾고 그것을 다시 temp1에 저장
3. temp1.next인 23을 temp2에 저장
4. 추가할 90이라는 값을 newVertex에 저장
5. newVertex를 temp1.next 에 저장 
6. nexVertex.next에 temp2인 23을 저장


### List 노드 삭제

Vertex cur = head
while (--k!=0)
  cur = cur.next
Vertex tobedeleted = cur.next
cur.next = cur.next.next
delete tobedeleted

이번에는 삭제의 경우를 알아보자.

1. cur에 head인 15를 저장
2. k = 2로 초기화되어 있어서 next인 6을 찾고 그것을 다시 cur에 저장
3. tobedeleted에 삭제 되어야할 cur.next를 저장
4. 현재 cur은 6인 상태이며 cur.next에 90이 아닌 23을 저장
5. tobedeleted는 삭제


### 정리

자료 구조를 공부하는 이유는 어떤 특성이 좋아지면 다른 특성은 나빠지는 트레이드 오프를 이해하기 위해서이다. 쉽게 말해 장단점을 쉽게 파악하고 이 이해를 바탕으로 특정한 상황에서 적합한 선택을 하기 위함이다.



