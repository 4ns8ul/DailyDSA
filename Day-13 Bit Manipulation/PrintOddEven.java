import java.util.Scanner;
class Program{
	static void printOddEven(int num){
		if(isBitSet(num, 0)){
			System.out.println("Number is odd.");
		}else {
			System.out.println("Number is even.");
		}
		
	}
	
	static boolean isBitSet(int num, int bit){
		int res = num & (1 << bit);
		return (res==0)?false:true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		printOddEven(num);
	}
}