import java.util.Scanner;
class Program{
	static int findTrailingZerosFactorial(int num){
		int res = 0;
		for(int i=5; i<=num; i=i*i){
			res = res + num/i;
		}
		return res;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(findTrailingZerosFactorial(num));
	}
}