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
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int A=Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] list=new int[3];
        for(int i=0;i<3;i++){
            list[i]=Integer.parseInt(stk.nextToken());
            //System.out.println(list[i]);
        }
        Arrays.sort(list);
        for(int i=0;i<3;i++){
            System.out.print(list[i]+" ");
        }    
	}
}