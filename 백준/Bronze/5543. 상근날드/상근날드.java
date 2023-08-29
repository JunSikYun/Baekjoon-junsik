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
        int[] list1 = new int[3];
        int[] list2 = new int[2];
        int min=2000;
        for (int i = 0; i < 3; i++) {
            list1[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<2;i++){
            list2[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(list1[i]+list2[j]<min){
                    min=list1[i]+list2[j];
                }
            }
        }
        System.out.println(min-50);
    }
}