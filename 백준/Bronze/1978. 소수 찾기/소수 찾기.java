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
        // StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int count=0;
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int a=Integer.parseInt(stk.nextToken());
            for(int j=2;j<=a;j++){
                if(a%j==0&&a!=j){
                    break;
                }
                else if(a==j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}