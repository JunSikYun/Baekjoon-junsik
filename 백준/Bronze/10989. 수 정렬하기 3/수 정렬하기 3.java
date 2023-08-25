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
        StringBuilder sb=new StringBuilder();
        int a=Integer.parseInt(br.readLine());
        int[] list=new int[a];
        for(int i=0;i<a;i++){
            list[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        for(int i=0;i<a;i++){
            sb.append(list[i]).append('\n');
        }
        System.out.println(sb);
    }
}