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
        StringBuilder sb = new StringBuilder();
        boolean tag = true;
        while (tag) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            int c = Integer.parseInt(stk.nextToken());
        	if(a == 0 && b == 0 && c == 0){
            break;
            } 
        	if((a * a + b * b) == c * c) {
				System.out.println("right");
			}
        	else if(a * a == (b * b + c * c)) {
				System.out.println("right");
			}
        	else if(b * b == (c * c + a * a)) {
				System.out.println("right");
			}
        	else {
				System.out.println("wrong");
			}
        }
    }
}