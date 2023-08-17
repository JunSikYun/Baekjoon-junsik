import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도상 Systme.out.prinln
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] list = new int[26];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = -1;
		}
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			if(list[s.charAt(i)%97] == -1) {
				list[s.charAt(i)%97] = i;
			}
		}
        for(int j=0;j<list.length;j++){
            System.out.print(list[j]+" ");
        }
	}
}