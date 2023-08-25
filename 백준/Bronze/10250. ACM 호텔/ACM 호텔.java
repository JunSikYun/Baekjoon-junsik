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
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer stk=new StringTokenizer(br.readLine());
            int H=Integer.parseInt(stk.nextToken());
            int W=Integer.parseInt(stk.nextToken());
            int N=Integer.parseInt(stk.nextToken());
            //N%H=층수(N/H)+1=호수 수
            if(N%H==0){
                System.out.println((H*100)+(N/H));
            }
            else{
                System.out.println(((N%H)*100)+(N/H)+1);
            }
        }
    }
}