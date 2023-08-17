import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도상 Systme.out.prinln
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
		if (a != b && b != c && a != c) {
			int max;
			if (a > b) {
				if (c > a) {
					max = c;
				} 
				else {
					max = a;
				}
			}
			else {
				if (c > b) {
					max = c;
				}
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		else {
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
// 97~122 소문자 아스키 코드 값
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