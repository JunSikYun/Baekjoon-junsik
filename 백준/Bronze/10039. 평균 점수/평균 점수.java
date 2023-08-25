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

        int[] list=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            list[i]=Integer.parseInt(br.readLine());
            if(list[i]<40){
                list[i]=40;
            }
            sum+=list[i];
        }
        System.out.println(sum/5);


    }
}