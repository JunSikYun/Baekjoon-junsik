import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] apt=new int[15][15];
        for(int i=0;i<15;i++){
            apt[i][1]=1;
            apt[0][i]=i;
        }
        for(int i=1;i<15;i++){
            for(int j=2;j<15;j++){
                apt[i][j]=apt[i][j-1]+apt[i-1][j];
            }
        }
        int a=Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }
}