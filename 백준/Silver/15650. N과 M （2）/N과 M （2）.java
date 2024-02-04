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
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int[] list;
    public static int N, M;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        N=Integer.parseInt(stk.nextToken());
        M=Integer.parseInt(stk.nextToken());

        list=new int[M];

        Solution(1,0);
        System.out.println(sb);
    }
    public static void Solution(int n,int m){
        if(m==M){
            for(int num:list){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=n;i<=N;i++){
            list[m]=i;
            Solution(i+1,m+1);
        }
    }
}