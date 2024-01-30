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

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        // int A=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int[] list=new int[N];
        int[] num=new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list[i]=Integer.parseInt(stk.nextToken());
        }
        for(int i=0;i<N;i++){
            num[i]=1;
            for(int j=0;j<i;j++){
                if(list[j]<list[i]&&num[i]<num[j]+1){
                    num[i]=num[j]+1;
                }
            }
        }
        int max=-1;
        for(int i=0;i<N;i++){
            max=num[i]>max?num[i]:max;
        }
        System.out.println(max);
    }
}