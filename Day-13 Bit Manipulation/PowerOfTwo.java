import java.util.Scanner;
class Program{
	static boolean powerOfTwo(int num){
		return ((num & num-1) == 0)?true:false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(powerOfTwo(num));
	}
}