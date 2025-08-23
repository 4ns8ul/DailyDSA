import java.util.Scanner;

class Solution{
	public static int clearLSB(int num, int bit){
		return (num & ~((1<<bit+1)-1));
		
	}
	
	public static int clearMSB(int num, int bit){
		return (num & ((1<<bit)-1));
	}
	
	public static int clearMSBExclusive(int num, int bit){
		return (num & ((1<<bit+1)-1));// In this case the bits will be converted excluding the ith position
	}
	
	public static void printBits(int num){
		for(int i=7; i>=0; i--){
			System.out.print((num>>i+1) & 1); 
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bit = sc.nextInt();
		
		printBits(num);
		int res1 = clearLSB(num, bit);
		printBits(res1);
		int res2 = clearMSB(num, bit);
		printBits(res2);
		int res3 = clearMSBExclusive(num, bit);
		printBits(res3);
		// clearMSBExclusive(num, bit);
	}
}