import java.util.Scanner;
class ReverseNumber{

	static String reverseNum(int num){
		StringBuilder reverse = new StringBuilder();
		while(num>0){
			reverse.append(num%10);
			num /= 10;
		}
		return reverse.toString();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The reverse of the given number is:  " + reverseNum(num));
	}
}