import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        String input2 = sc.next();
        char[] sum = new char[input1];
        for (int i = 0; i < input1; i++) {
            sum[i] = input2.charAt(i);
        }
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            result += Character.getNumericValue(sum[i]);
        }
        System.out.println(result);
    }
}
