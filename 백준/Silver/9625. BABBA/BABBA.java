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
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // int A=Integer.parseInt(br.readLine());
        int count=Integer.parseInt(br.readLine());
        int[][] list=new int[2][46];
        list[0][2]=1;
        list[1][1]=1;
        list[1][2]=1;
        for(int i=3;i<=count;i++){
            list[0][i]=list[0][i-2]+list[0][i-1];
            list[1][i]=list[1][i-2]+list[1][i-1];
        }
        System.out.print(list[0][count]+" "+list[1][count]);
	}
}