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
        StringBuilder sb=new StringBuilder();
        int a=Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int b:list){
            sb.append(b).append('\n');
        }
        System.out.println(sb);
    }
}