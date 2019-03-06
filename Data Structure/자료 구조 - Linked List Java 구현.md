~~~
package list.linkedlist.implementation;

class LinkedList {
    // 첫번째 노드를 가리키는 필드
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node{
        // 데이터가 저장될 필드
        private Object data;
        // 다음 노드를 가리키는 필드
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
        public String toString(){
            return String.valueOf(this.data);
        }
    }
    public void add(int k, int input) {
        // k가 0이면 가장 첫 번째 추가하는 것이므로 addFirst 활용
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            // k번째 노드를 temp2로 지정
            Node temp2 = temp1.next;
            // 노드 생성
            Node newNode = new Node(input);
            // temp1의 다음 노드로 새 노드를 지정
            temp1.next = newNode;
            // 새 노드의 다음 노드로 temp2를 지정
            newNode.next = temp2;
            // size 증가
            size++;
            if(newNode.next == null){
                tail = head;
            }
        }
    }
    public void addFirst(int input){
        // 노드 생성
        Node newNode = new Node(input);
        // 새 노드의 다음 노드를 헤드로 지정
        newNode.next = head;
        // 새 노드를 헤드로 지정
        head = newNode;
        size++;
        if(head.next == null)
            tail = head;
    }
    public void addLast(int input){
        // 노드 생성
        Node newNode = new Node(input);
        // 리스트 노드가 없다면 첫 번째 노드 추가
        if(size == 0){
            addFirst(input);
        } else {
            // 마지막 노드의 다음 노드로 생성한 노드를 지정
            tail.next = newNode;
            // 마지막 노드 갱신
            tail = newNode;
            // 엘리먼트 개수 증가
            size++;
        }
    }
    public Node node(int index){
        Node x = head;
        for(int i = 0; i < index; i++){
                x = x.next;
        }
        return x;
    }
    public String toString(){

    }

}
package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.add(2, 30);

        for(int i = 0; i < 6; i++)
            System.out.println(numbers.node(i));
    }
}
~~~