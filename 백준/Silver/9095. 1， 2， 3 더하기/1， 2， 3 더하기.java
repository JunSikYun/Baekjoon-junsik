import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도상 Systme.out.prinln
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int[] list=new int[11];
        //1, 2, 3은 고정으로 사용
        list[1]=1;
        list[2]=2;
        list[3]=4;
        //4의 경우의 수는 1+3, 2+2, 3+1 -> 그러므로 각각 3에 대한 경우의 수 4, 2에 대한 경우의 수 2, 1에 대한 경우의 수 1 -> 4+2+1=7
        for(int i=4;i<=10;i++){
            list[i]=list[i-3]+list[i-2]+list[i-1];
        }
        for(int j=0;j<a;j++){
            int input=Integer.parseInt(br.readLine());
            System.out.println(list[input]);
        }
    }
}