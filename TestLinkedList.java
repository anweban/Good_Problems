import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class TestLinkedList {
    public <T> LinkedList<T> addData(T elem){
        LinkedList<T> ll = new LinkedList<>();
        ll.addNodeWithData(elem);
        return ll;
    }
    public <T extends Number> LinkedList<T> addData2(T elem){
        LinkedList<T> ll = new LinkedList<>();
        //Integer nn = 23;
        //ll.addNodeWithData(nn); // This is wrong. Only T type can be passed, not integer. Even if T extends Number in the type parameter
        ll.addNodeWithData(elem);
        return ll;
    }
    /*public LinkedList<? extends Number> addNodeTest(Node<? extends Number> node){
        LinkedList<? extends Number> ll = new LinkedList<>();
        ll.addNode(node); // This is not allowed because ll has a type ? extends Number
        ll.root = node; // This is not allowed because ll has a type ? extends Number
        return ll;
    }*/
    /*public LinkedList<? extends Number> addNodeTest2(Node<Number> node){
        LinkedList<? extends Number> ll = new LinkedList<>();
        //ll.addNode(node); // This is not allowed because ll has a type ? extends Number and addNode has parameter Node<T> which
        //means it is can be Node<Integer>, Node<Float>, Node<Number>. Hence, it will not necessarily be Node<Number>.
        //ll.root = node; // This is not allowed because of same reason as above
        Integer c = 123;
        ll.addNodeWithData(c); // This is not allowed this is allowed to compile because addNodeWithData has a parameter of Type T
        // which can be Integer, Float, Number. Hence it will not necessarily be a supertype of Integer.
        return ll;
    }*/
    /* public LinkedList<? super Number> addNodeTest3(Node<Number> node){
        LinkedList<? super Number> ll = new LinkedList<>();
        ll.addNode(node); // compile time error because addNode has parameter Node<T> which means it is can be
        //Node<Number> or Node<Object> and none of these are supertypes of Node<Integer>
        ll.root = node; // This is not allowed because because of same reason as above
        Integer c = 123;
        ll.addNodeWithData(c); // this is allowed to compile because addNodeWithData has a parameter of Type T which can
        //be Number or Object and both of them are supertypes of Integer
        return ll;
    }*/

    public static void main(String[] args) {
        TestLinkedList t = new TestLinkedList();
        LinkedList<String> ll = t.addData("Anwesha");
        ll.disp();
        Float ff = 1234.00f;
        LinkedList<Float> l1233 = t.addData(ff);
        l1233.disp();
        LinkedList<Float> l1234 = t.addData2(ff);
        l1234.disp();
        int x = 23;
        LinkedList<Number> l1235 = new LinkedList<>();
        l1235.addNodeWithData(x);
        l1235.addNodeWithData(ff);
        l1235.disp();
        List<Integer> arrInt = new ArrayList<Integer>();
        arrInt.add(44);
        Iterator<Integer> intIterator = arrInt.iterator();
        System.out.println(intIterator.getClass().getSimpleName());
    }
}
