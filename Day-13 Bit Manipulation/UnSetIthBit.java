import java.util.Scanner;
class Program{
	static int unSetIthBit(int num, int bit){
		return num & (~(1 << bit));
	}
	
	static void printBits(int num){
		for(int i=7; i>=0; i--){
			System.out.print((num>>i) & 1);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bit = sc.nextInt();
		
		printBits(num);
		System.out.println();
		
		int res = unSetIthBit(num, bit);
		printBits(res);
		
		System.out.println();
		System.out.println(res);
	}
}