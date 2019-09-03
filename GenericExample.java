import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericExample {
    public static <T extends InheritencePrivateFields> void process(T obj) {
        if(obj.getClass().getSimpleName().equals("InheritencePrivateFields")){
            System.out.println(obj.getc());
        }else if(obj.getClass().getSimpleName().equals("InheritanceChildClass")){
            InheritanceChildClass obj1 = (InheritanceChildClass) obj;
            obj1.disp();
        }
    }
    public void upperBoundedWildCardExample(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(9);
        List<? extends Number> numList = intList;
        for(Number n:numList){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        GenericExample g = new GenericExample();
        g.upperBoundedWildCardExample();
        int r = 7, n = 8;
        Object a = r;
        Object b = n;
        System.out.println(a);
        List<? extends Number> unboundList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        intList.add(9000);
        unboundList = intList;
        List<Float> numList = (List<Float>) unboundList;
        System.out.println(numList);
        //int c = 9;
        //Object x = c;
        //String abc = (String)x; //class cast exception
    }

}
