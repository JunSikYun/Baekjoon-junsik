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
        StringTokenizer stk=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(stk.nextToken());
        int B=Integer.parseInt(stk.nextToken());
        int a=((A%10)*100)+(((A-((A/100)*100))/10)*10)+(A/100);
        int b=((B%10)*100)+(((B-((B/100)*100))/10)*10)+(B/100);
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}