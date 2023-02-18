import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        LinkList MyList = new LinkList();
        MyList.add("Значение 1");
        MyList.add("Значение 2");

        MyList.add(1, "промежуточное");


        Iterator<String> iterator = MyList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}