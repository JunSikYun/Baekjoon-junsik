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
        //System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            list[i] = Integer.parseInt(stk.nextToken());
        }

        int student = Integer.parseInt(br.readLine());

        for (int i = 0; i < student; i++) {
            stk = new StringTokenizer(br.readLine());
            int gen = Integer.parseInt(stk.nextToken());
            int num = Integer.parseInt(stk.nextToken());

            if (gen == 1) {
                for (int j = 0; j < a; j++) {
                    if ((j + 1) % num == 0) {
                        list[j] = list[j] == 0 ? 1 : 0;
                    }
                }
            } else if (gen == 2) {
                list[num - 1] = list[num - 1] == 0 ? 1 : 0;
                for (int j = 1; j < (a / 2); j++) {
                    if (num - j - 1 < 0 || num + j - 1 >= a) {
                        break;
                    }
                    if (list[num - j - 1] == list[num + j - 1]) {
                        list[num - j - 1] = list[num - j - 1] == 0 ? 1 : 0;
                        list[num + j - 1] = list[num + j - 1] == 0 ? 1 : 0;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(list[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}