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
        // StringBuilder sb = new StringBuilder();
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(stk.nextToken());
        int B=Integer.parseInt(stk.nextToken());

        if(A>B){
            System.out.println(">");
        }
        else if(A==B){
            System.out.println("==");
        }
        else if(A<B){
            System.out.println("<");
        }
	}
}