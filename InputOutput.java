import java.util.*;
import java.io.*;
public class InputOutput{
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.parseInt(in.next()); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            System.out.println(m+":"+n+":"+t);
        }
    }
}


