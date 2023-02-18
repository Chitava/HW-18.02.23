import java.util.Iterator;

public class LinkList implements Iterable{

    private Item head;
    private Item tail;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Item element0 = new Item("0");
            {
                element0.setNext(head);
            }
            Item currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }


    private Item getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        Item result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public void add(int index, Object data){
        if (count == index){
            add(data);
            return;
        }
        count++;

        Item currentElement = new Item(data);

        if (index == 0){
            head = currentElement;
        }

        Item nextElement = getElement(index);
        Item previousElement = nextElement.getPrevious();

        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }

    }

    public void add(Object data){
        count++;
        Item element = new Item(data);
        if (head == null){
            head = element;
            tail = element;
            return;
        } else if (tail == null) {
            tail = element;
            return;
        }

        tail.setNext(element);
        element.setPrevious(tail);
        tail = element;
    }

}

