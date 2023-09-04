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
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int R = Integer.parseInt(stk.nextToken());
        int[][] list = new int[N][M];
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                list[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int count = Math.min(N, M) / 2;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < count; j++) {
                int tmp = list[j][j];
                for (int k = j + 1; k < M - j; k++){
                    list[j][k - 1] = list[j][k];
                }
                for (int k = j + 1; k < N - j; k++){
                    list[k - 1][M - 1 - j] = list[k][M - 1 - j];
                }
                for (int k = M - 2 - j; k >= j; k--){
                    list[N - 1 - j][k + 1] = list[N - 1 - j][k];
                }
                for (int k = N - 2 - j; k >= j; k--){
                    list[k + 1][j] = list[k][j];
                }
                list[j + 1][j] = tmp;
            }
        }
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < M; k++) {
                System.out.print(list[j][k] + " ");
            }
            System.out.println();
        }
    }
}