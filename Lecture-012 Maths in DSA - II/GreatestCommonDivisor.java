import java.util.Scanner;
class Program{
	static void GCD(int num1, int num2){
		int min;
		
		if(num1<=num2) min = num1;
		else min = num2;
		
		while(min > 0){
			if(num1%min==0 && num2%min==0){
				System.out.println("GCD: " + min);
				return;
			}
			min--;
		}
		int max;
		if(num1<=num2) max = num2;
		else max = num1;
		
		System.out.println("GCD: " + min);
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		GCD(num1, num2);
	}
}