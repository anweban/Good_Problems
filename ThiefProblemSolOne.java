import java.util.*;
import java.io.*;
import java.lang.Math;
public class ThiefProblemSolOne {
    public static int optimumSolMethod1(List<Integer> intList, int n){
        int sum = 0;
        if(n == 1){
            return intList.get(0);
        }else{
            for(int i = 0; i<n; i++){
                int retVal;
                if(n>i+2) {
                    List<Integer> nextIntList = new ArrayList<Integer>();
                    for (int j = i + 2; j < n; j++) {
                        nextIntList.add(intList.get(j));
                    }
                    retVal = intList.get(i)+optimumSolMethod1(nextIntList,n-i-2);
                }
                else {
                    retVal = intList.get(i);
                }
                if(retVal > sum){
                    sum = retVal;
                }
            }
            return sum;
        }
    }

    public static int optimumSolMethod2(List<Integer> intList){
        int sum = 0;
        if(intList.size() == 1){
            return intList.get(0);
        }else if(intList.size() == 0) {
            return 0;
        }else{
            List<Integer> nextIntList1 = new ArrayList<Integer>();
            List<Integer> nextIntList2 = new ArrayList<Integer>();
            for (int i = 1; i < intList.size(); i++) {
                nextIntList1.add(intList.get(i));
                if(i>1){
                    nextIntList2.add(intList.get(i));
                }
            }
            sum = Math.max(intList.get(0)+optimumSolMethod2(nextIntList2),optimumSolMethod2(nextIntList1));
            return sum;
        }
    }

    public static int optimumSolMethod3(List<Integer> intList){
        int n = intList.size()+1;
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            if(i == 0){
                arr[i] = 0;
            }else if( i == 1){
                arr[i] = intList.get(intList.size() - 1);
            }else{
                arr[i] = Math.max(intList.get(intList.size()-i)+arr[i-2],arr[i-1]);
            }
        }
        return arr[n-1];
    }


    public static void main(String[] args) {
        int n;
        List<Integer> intList = new ArrayList<Integer>();
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("enter length:");
        n = Integer.parseInt(sc.next());
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            intList.add(Integer.parseInt(sc.next()));
        }
        System.out.println("Method 1 Result:");
        System.out.println(optimumSolMethod1(intList,n));
        System.out.println("Method 2 Result:");
        System.out.println(optimumSolMethod2(intList));
        System.out.println("Method 3 Result:");
        System.out.println(optimumSolMethod3(intList));
    }
}
