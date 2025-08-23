import java.util.Scanner;
class Program{
	static boolean palindromeNum(int num1){
		if(num1 == 0) return true;
		
		int num2 = num1;
		int palindrome = 0;
		while(num2>0){
			palindrome = (palindrome*10) + (num2%10);
			num2 /= 10;
		}
		return palindrome==num1;	
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(palindromeNum(num));
	}
}