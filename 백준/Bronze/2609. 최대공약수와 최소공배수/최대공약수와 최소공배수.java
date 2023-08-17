import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도상 Systme.out.prinln
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(stk.nextToken());
        int b=Integer.parseInt(stk.nextToken());
        System.out.println(gcd(a,b)+"\n"+lcm(a, b));
	
    }
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}