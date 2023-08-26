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
        int a=Integer.parseInt(br.readLine());
        Stack<Integer> list=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a;i++){
            StringTokenizer stk=new StringTokenizer(br.readLine());
            String input=stk.nextToken();

            if(input.equals("push")){
                list.push(Integer.parseInt(stk.nextToken()));
            }
            else if(input.equals("pop")){
                if(!list.empty()){
                    sb.append(list.pop()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(input.equals("size")){
                sb.append(list.size()).append("\n");
            }
            else if(input.equals("empty")){
                if(!list.empty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(1).append("\n");
                }
            }
            else{
                if(!list.empty()){
                    sb.append(list.peek()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}