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
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer stk = new StringTokenizer(br.readLine());
        int X=Integer.parseInt(br.readLine());
        int Y=Integer.parseInt(br.readLine());
        if(X>0&&Y>0){
            System.out.print(1);
        }
        else if(X>0&&Y<0){
            System.out.print(4);
        }
        else if(X<0&&Y>0){
            System.out.print(2);
        }
        else if(X<0&&Y<0){
            System.out.print(3);
        }
    }
}