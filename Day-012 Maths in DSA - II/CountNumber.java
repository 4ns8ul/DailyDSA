import java.util.Scanner;
class Program{
	static int countNumber(int num){
		int count=0;
		if(num==0){
			return 1;
		}
		while(num>0){
			num/=10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(countNumber(num));
	}
}