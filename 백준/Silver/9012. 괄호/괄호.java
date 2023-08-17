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
        String str;
        for (int i = 0; i < a; i++) {
            str = br.readLine();
            System.out.println(VPS(str));;
        }
    }
    public static String VPS(String str) {
        Stack<Character> list = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') {
                list.push(str.charAt(j));
            } else if (list.empty()) {
                return "NO";
            } else {
                list.pop();
            }
        }
        if (list.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}