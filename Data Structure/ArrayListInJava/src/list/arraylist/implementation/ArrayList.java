package list.arraylist.implementation;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addLast(Object element){
        elementData[size] = element;
        size++;
        return  true;
    }

    public boolean add(int index, Object element){
        for(int i = size - 1; i >= index; i--){
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element){
        return add(0, element);
    }

    public String toString(){
        String str = "[";
        for(int i = 0; i < size; i++){
            str += elementData[i];
            if(i < size - 1)
                str += ",";
        }
        return str + "]";
    }

    public boolean removeAt(int index){
        for(int i = index + 1; i <= size -1; i++ )
            elementData[i - 1] = elementData[i];

        size--;
        elementData[size] = null;
        return true;
    }

    public boolean removeFirst(){
        return removeAt(0);
    }

    public boolean removeLast(){
        return removeAt(size - 1);
    }

    public Object get(int index){
        return elementData[index];
    }

    public int size(){
        return size;
    }

    public int indexOf(Object findValue){
        int index = 0;
        for(int i = 0; i < size -1; i++){
            if(elementData[i] == findValue)
                index = i;
        }
        return index;
    }

    public ListIterator listIterator(){

        return new ListIterator();
    }

    class ListIterator{
        private int nextIndex = 0;

        public boolean hasNext(){
            return nextIndex < size();
        }
        public Object next(){
            return elementData[nextIndex++];
        }

        public boolean hasPrevious(){
            return nextIndex > 0;
        }

        public Object previous(){
            return elementData[--nextIndex];
        }

        public void add(Object element){
            ArrayList.this.add(nextIndex++, element);
        }

        public void remove(){
            ArrayList.this.removeAt(nextIndex-1);
            nextIndex--;
        }
    }


}
