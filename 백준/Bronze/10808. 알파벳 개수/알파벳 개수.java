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
        // StringTokenizer stk=new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] list = new int[26];
        String n = br.readLine();
        for (int i = 0; i < n.length(); i++) {
            int check=n.charAt(i)-97;
            list[check]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(list[i]+" ");
        }
    }
}