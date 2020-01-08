package CodeChef;

import java.util.*;
import java.lang.Math;

public class Ctrick {
    public static void displayCardSeq(int n){
        int[] cardsArray = new int[n];
        int pos = -1;
        for(int i = 1; i <=n; i++){
            if(pos < n-1){
                pos++;
            }else{
                pos = 0;
            }
            int j = 0;
            while(j < i){
                if(cardsArray[pos] == 0){
                    pos = (pos+1)%n;
                    j++;
                }else{
                    pos = (pos+1)%n;
                }
            }
            while(cardsArray[pos] != 0){
                pos = (pos+1)%n;
            }
            cardsArray[pos] = i;
            System.out.println("i--->"+i+" pos--->"+pos);
        }
        for(int i = 0; i < n; i++){
            System.out.print(cardsArray[i]+" ");
        }
    }

    /*public static void displayCardSeqWithBit(int n){
        int[] cardsArray = new int[n];
        int[] bit = new int[n+1];
        createBIT(bit);
        int pos = -1;
        for(int i = 1; i <= n; i++){
            int idx = pos+1;
            int idx = getCumFreq((pos+i)%n,bit);
            cardsArray[idx] = i;
            pos = idx;

            int sum = (lastpos + i + 1) % (n+1);
            int idx = findIndex(bit,sum);
            if(idx != -1) {
                if(cardsArray[idx] == 0) {
                    cardsArray[idx] = i;
                    lastpos = bit[idx];
                }else{
                    while(cardsArray[idx] != 0){
                        idx = (idx+1)%n;
                    }
                    cardsArray[idx] = i;
                    lastpos = bit[idx];
                }
            }else{
                while(cardsArray[lastpos] != 0){
                    lastpos = (lastpos+1)%n;
                }
                cardsArray[lastpos] = i;
            }

        }
        for(int i = 0; i < n; i++){
           System.out.print(cardsArray[i]+" ");
        }
    }*/
    public static void createBIT(int[] bit){
        int n = bit.length;
        for(int i = 0; i < n-1; i++){
            int idx = i;
            while(idx < n){
                bit[idx]++;
                if(idx == 0) {
                    idx++;
                }else{
                    idx += (idx & -idx);
                }
            }
        }
        bit[n-1] = 0;
    }
    /*public static int findIndex(int[] bit, int cumFreq){
        for(int i = 0; i < bit.length; i++){
            System.out.print(bit[i]+" ");
        }
        System.out.println("here");
        int n = bit.length;
        int idx = 0;
        int msdOfN = (int) (Math.log(n-1)/Math.log(2));
        int bitMask = (int) Math.pow(2.0,(double) msdOfN);
        System.out.println("bitMask--->"+bitMask);
        int tidx = 0;
        while(cumFreq > 0){
            System.out.println("cumFreq--->"+cumFreq);
            tidx = idx + bitMask;
            System.out.println("tidx--->"+tidx);
            if(bit[tidx] < cumFreq){
                System.out.println("yes");
                cumFreq -= bit[tidx];
                idx = tidx;
            }else if(bit[tidx] == cumFreq){
                break;
            }
            if(bitMask > 0) {
                bitMask >>= 1;
            }else{
                return -1;
            }
            System.out.println("bitMask1--->"+bitMask);
        }
        //update(bit,tidx);
        return tidx;
    }*/

    public static int getCumFreq(int idx, int[] bit){
        int sum = 0;
        while(idx > 0){
            sum = sum + bit[idx];
            idx -= (idx & -idx);
        }
        return sum;
    }

    /*public static void update(int[] bit, int idx){
        while(idx < bit.length){
            bit[idx] -= 1;
            idx += (idx & -idx);
        }
    }*/

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        displayCardSeq(num);
    }
}
