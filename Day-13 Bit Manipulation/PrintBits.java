import java.util.Scanner;
class Program{
	static void printBits(int num){
		for(int i=7; i>=0; i--){
			System.out.print((num>>i) & 1);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		printBits(num);
	}
}