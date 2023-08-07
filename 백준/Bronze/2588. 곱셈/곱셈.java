import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도상 Systme.out.prinln
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        int a=Integer.parseInt(br.readLine());//Integer.parseInt(stk.nextToken());
        int b=Integer.parseInt(br.readLine());//Integer.parseInt(stk.nextToken());
        int x=a*(b%10);
        int y=(a*(b%100-b%10))/10;
        int z=(a*(b/100));
        int sum=x+y*10+z*100;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(sum);
        // int b=Integer.parseInt(stk.nextToken());
        // System.out.println(a+b);
        // bw.write(String.valueOf(a-b));
        // bw.newLine();//개행 넣어주기
        // bw.write(String.valueOf(a));
        // bw.flush();
        // for(int i=0;i<TC;i++){
        // StringTokenizer stk=new StringTokenizer(br.readLine());
        // int a=Integer.parseInt(stk.nextToken());
        // int b=Integer.parseInt(stk.nextToken());
        // System.out.println(a-b);
        // br.readLine();
    }
}