import java.util.Scanner;

class Solution{
	public static int charConvToUpper(int ascii){
		return ascii & ~(1<<5);
	}
	
	public static int charConvToLower(int ascii){
		return ascii | (1<<5);
	}
	
	public static void printBits(int num){
		for(int i=7; i>=0; i--){
			System.out.print((num>>i) & 1); 
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int ascii = str.charAt(0);
		printBits(ascii);
		
		int res1 = charConvToLower(ascii);
		printBits(res1);
		System.out.println(res1);
		
		char asciiInt = (char) res1;
		System.out.println(asciiInt);
	}
}