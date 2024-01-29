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
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // int A=Integer.parseInt(br.readLine());
        String input=br.readLine();
        Integer[] list=new Integer[input.length()];
        for(int i=0;i<list.length;i++){
            list[i]=input.charAt(i)-'0';
        }
        Arrays.sort(list,Collections.reverseOrder());

        for(int i=0;i<list.length;i++){
            System.out.print(list[i]);
        }

	}
}