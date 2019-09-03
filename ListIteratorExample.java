import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        ListIterator<Integer> litr1 = integerArrayList.listIterator(5);
        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());
        System.out.println(litr1.nextIndex());
        System.out.println(litr1.previous());

        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());
        System.out.println(litr1.previous());

        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());
        System.out.println(litr1.previous());

        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());
        System.out.println(litr1.previous());

        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());
        System.out.println(litr1.previous());

        System.out.println(litr1.hasPrevious());
        System.out.println(litr1.previousIndex());

        ListIterator<Integer> litr2 = integerArrayList.listIterator(0);
        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());
        System.out.println(litr2.next());

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());
        System.out.println(litr2.next());

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());
        System.out.println(litr2.next());

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());
        System.out.println(litr2.next());

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());
        System.out.println(litr2.next());

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());

        litr2.add(45);

        System.out.println(litr2.hasNext());
        System.out.println(litr2.nextIndex());

        System.out.println(litr2.previousIndex());
        System.out.println(litr2.previous());


    }

}
