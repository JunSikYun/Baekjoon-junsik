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
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        int w = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());
        if (h - y < y) {
            if (w - x < x) {
                if (h - y > w - x) {
                    System.out.println(w - x);
                } else {
                    System.out.println(h - y);
                }
            } else {
                if (h - y > x) {
                    System.out.println(x);
                } else {
                    System.out.println(h - y);
                }
            }
        } else {
            if (w - x < x) {
                if (y > w - x) {
                    System.out.println(w - x);
                } else {
                    System.out.println(y);
                }
            } else {
                if (y > x) {
                    System.out.println(x);
                } else {
                    System.out.println(y);
                }
            }
        }
    }
}