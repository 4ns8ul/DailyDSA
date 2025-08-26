import java.util.Scanner;

class Solution{
	
	public static void swapNumbers(int num1, int num2){
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("Numbers after swapping =>  num1: " + num1 + ", num2: " + num2);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Numbers before swapping =>  num1: " + num1 + ", num2: " + num2);
		swapNumbers(num1, num2);
		System.out.println();
		System.out.println(num1 ^ num2);
	}
}