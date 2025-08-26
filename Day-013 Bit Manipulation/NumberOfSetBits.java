import java.util.Scanner;
class Program{
	static int countNumberOfSetBits(int num){
		int count = 0;
		for(int i=7; i>=0; i--){
			if (((num >> i) & 1) == 1) count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(countNumberOfSetBits(num));
	}
}