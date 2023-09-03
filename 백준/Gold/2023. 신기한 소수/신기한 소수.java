import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(stk.nextToken());
        int[] list={2,3,5,7};
        for(int i=0;i<4;i++){
            check(list[i],N-1);
        }
    }
    public static void check(int f, int n){
        if(n==0){
            System.out.println(f);
        }
        for(int i=1;i<10;i+=2){
            int tmp=f*10+i;
            if(isPrime(tmp)){
                check(tmp,n-1);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}