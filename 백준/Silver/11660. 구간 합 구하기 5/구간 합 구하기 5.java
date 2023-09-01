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
        int n_count=Integer.parseInt(stk.nextToken());

        int[][] list=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            stk=new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                list[i][j]=list[i][j-1]+Integer.parseInt(stk.nextToken());
            }
        }
        
        for(int i=1;i<=n_count;i++){
            int sum =0;
            stk=new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(stk.nextToken());
            int y1=Integer.parseInt(stk.nextToken());
            int x2=Integer.parseInt(stk.nextToken());
            int y2=Integer.parseInt(stk.nextToken());
            for(int j=x1;j<=x2;j++){
                    sum+=list[j][y2]-list[j][y1-1];
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}