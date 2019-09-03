import java.util.*;
import java.io.*;
public class ArraySpiral {
    public List<List<Integer>> matrix = new ArrayList<List<Integer>>();
    public void showSpiral(int origin_x, int origin_y, int m, int n, int x, int y){
        if(origin_x != m-1 && origin_y != n-1) {
          if (x < y) {
              while (x <= m-1) {
                  System.out.print(matrix.get(y).get(x));
                  System.out.print(' ');
                  x = x + 1;
              }
              showSpiral(origin_x, origin_y, m, n, m - 1, n - 1);
          }
          if (x == m - 1 && y == n - 1) {
              y = y - 1;
              while (y >= origin_y) {
                  System.out.print(matrix.get(y).get(x));
                  System.out.print(' ');
                  y = y - 1;
              }
              showSpiral(origin_x, origin_y, m, n, m - 1, origin_y);
          }
          if (x > y) {
              x = x - 1;
              while (x >= origin_x) {
                  System.out.print(matrix.get(y).get(x));
                  System.out.print(' ');
                  x = x - 1;
              }
              showSpiral(origin_x, origin_y, m, n, origin_x, origin_y);
          }
          if (x == origin_x && y == origin_y) {
            if(m != origin_x+1 && n != origin_y+1) {
                y = y + 1;
                while (y <= n - 2) {
                    System.out.print(matrix.get(y).get(x));
                    System.out.print(' ');
                    y++;
                }
                showSpiral(origin_x + 1, origin_y + 1, m - 1, n - 1, x + 1, n - 2);
            }
          }
        }else{
            System.out.print(matrix.get(y).get(x));
            System.out.print(' ');
        }
    }

    public static void main(String[] args) {
        ArraySpiral sp = new ArraySpiral();
        int m,n;
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Enter rows");
        n = Integer.parseInt(sc.next());
        System.out.println("Enter columns");
        m = Integer.parseInt(sc.next());
        System.out.println("Enter matrix");
        for(int i = 0; i<n; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<m; j++) {
                row.add(Integer.parseInt(sc.next()));
            }
            sp.matrix.add(row);
        }
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(sp.matrix.get(i).get(j));
            }

        }
        System.out.println(sp.matrix.get(0));
        sp.showSpiral(0,0,m,n,0,n-1);
    }

}
