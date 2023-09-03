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
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(stk.nextToken());
        int M=Integer.parseInt(stk.nextToken());
        int[] list=new int[N+1];
        stk=new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            list[i]=list[i-1]+Integer.parseInt(stk.nextToken());
        }
        for(int i=0;i<M;i++){
            stk=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(stk.nextToken());
            int b=Integer.parseInt(stk.nextToken());
            System.out.println(list[b]-list[a-1]);
        }
    }
}