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
        // StringBuilder sb=new StringBuilder();
        // StringTokenizer stk;
        String input=br.readLine();
        String[] list=new String[input.length()];

        for(int i=0;i<input.length();i++){
            list[i]=input.substring(i,input.length());
        }

        Arrays.sort(list);
        for(String output:list){
            System.out.println(output);
        }
    }
}