import java.util.Scanner;
class Program{
	static int factorialOfNumber(int num){
		int result = 1;
		if(num==0) return 1;
		while(num > 1){
			result = result * num;
			num--;
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(factorialOfNumber(num));
	}
}