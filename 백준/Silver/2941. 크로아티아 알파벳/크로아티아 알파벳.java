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
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'c' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }
            } 
            else if (ch == 'd' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '-') {
                    i++;
                } else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
                    if (str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } 
            else if ((ch == 'l' || ch == 'n') && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'j') {
                    i++;
                }
            } 
            else if ((ch == 's' || ch == 'z') && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}