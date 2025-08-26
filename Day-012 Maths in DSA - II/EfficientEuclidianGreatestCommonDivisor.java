import java.util.Scanner;
class Program{
	static int efficientEuclidianGCD(int num1, int num2){
		while(num1 != 0 && num2 != 0){
			if(num1>num2) num1 %= num2;
			else num2 %= num1;
		}
			if(num1==0) return num2;
			else return num1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(efficientEuclidianGCD(num1, num2));
	}
}