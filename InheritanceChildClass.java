import java.util.List;

public class InheritanceChildClass extends InheritencePrivateFields {
    public void disp(){
        System.out.println("pppp");
    }
    public int returnVal(){
        return 101;
    }

    public static void main(String args[]){
        InheritanceChildClass obj = new InheritanceChildClass();
        System.out.println(obj.getc());
        System.out.println(obj.returnVal());
        System.out.println(obj.getClass().getSimpleName());
        InheritencePrivateFields obj1 = new InheritanceChildClass();
        System.out.println(obj1.returnVal());
        System.out.println(obj1.getClass().getSimpleName());
        //System.out.println(obj1.disp());  ---->error because type is InheritencePrivateFields
        obj.disp(); //no error
        int i = 9;
        Object ob = i;
    }
}
