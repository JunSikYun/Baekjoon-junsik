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
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb=new StringBuilder();
        StringTokenizer stk=new StringTokenizer(br.readLine());

        N=Integer.parseInt(stk.nextToken());
        M=Integer.parseInt(stk.nextToken());

        list=new int[M];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int d){
        if(d==M){
            for(int i=0;i<M;i++){
                sb.append(list[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=1;i<=N;i++){
            list[d]=i;
            dfs(d+1);
        }
    }
}