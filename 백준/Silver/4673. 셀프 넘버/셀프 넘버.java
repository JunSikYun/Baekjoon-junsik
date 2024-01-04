public class Main {
    public static void main(String[] args) throws Exception {
        boolean[] tag=new boolean[10001];
        for(int i=1;i<10001;i++){
            int n=d(i);

            if(n<10001){
                tag[n]=true;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=1;j<10001;j++){
            if(!tag[j]){
                sb.append(j).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10);
			number = number/10;
		}
    
		return sum;
	}
}