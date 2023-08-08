import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] list=new int[size];
        int tmp=0;
        for(int i=0;i<size;i++) {
        	list[i]=sc.nextInt();
        	if(tmp<list[i]) {
        		tmp=list[i];
        	}
        }
        double[] result=new double[size];
        double sum=0;
        for(int i=0;i<size;i++) {
        	result[i]=(Double.valueOf(list[i])/Double.valueOf(tmp))*100;
        	sum+=result[i];
        }
        System.out.println(sum/size);
    }
}
