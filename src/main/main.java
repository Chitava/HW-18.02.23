import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        LinkList MyList = new LinkList();
        MyList.add("�������� 1");
        MyList.add("�������� 2");

        MyList.add(1, "�������������");


        Iterator<String> iterator = MyList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}