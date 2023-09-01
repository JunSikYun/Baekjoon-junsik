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
        // StringBuilder sb = new StringBuilder();
        int[] list = new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
            sum+=list[i];
        }
        for (int i = 0; i < 8; i++) {
            for(int j=i+1;j<9;j++){
                if(sum-list[i]-list[j]==100){
                    list[i]=0;
                    list[j]=0;
                    Arrays.sort(list);
                    for(int k=2;k<9;k++){
                        System.out.println(list[k]);
                    }
                    return;
                }
            }
        }
    }
}