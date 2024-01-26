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
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // int A=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        Integer[] list=new Integer[N];
        for(int i=0;i<N;i++){
            list[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(list,Collections.reverseOrder());
        for(Integer i:list){
            writer.write(i+"\n");
        }
        writer.flush();
	}
}