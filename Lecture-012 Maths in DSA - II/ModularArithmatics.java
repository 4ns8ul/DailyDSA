import java.util.Scanner;
class Program{
	static int modularArithmatics(int num){
		double res = 1;
		while(power > 0){
			if(power%2 != 0){
				// res = res * num; // FastExponention code
				res = ((res) * (num%limit)) % limit;
			}
			power /= 2;
			num = ((num) * (num%limit)) % limit;
			// num = num*num;
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(modularArithmatics(num));
	}
}