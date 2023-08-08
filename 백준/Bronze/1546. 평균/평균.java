import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        int[] num=new int[count];
        int tmp=0;
        for(int i=0;i<count;i++) {
        	num[i]=sc.nextInt();
        	if(tmp<num[i]) {
        		tmp=num[i];
        	}
        }
        double[] num2=new double[count];
        double sum=0;
        for(int i=0;i<num2.length;i++) {
        	num2[i]=(double)(num[i]*100)/tmp;
        	sum+=num2[i];
        }
        System.out.println(sum/count);
    }
}
