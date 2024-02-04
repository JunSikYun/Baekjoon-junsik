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
        int year=Integer.parseInt(br.readLine());
        if(year%4==0){
            if(year%400==0){
                System.out.print(1);
            }
            else if(year%100==0){
                System.out.print(0);
            }
            else{
                System.out.print(1);
            }
        }
        else{
            System.out.print(0);
        }
    }
}