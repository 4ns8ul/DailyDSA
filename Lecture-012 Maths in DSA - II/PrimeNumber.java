import java.util.Scanner;
class Program{
	static boolean primeNum(int num){
		int sqrtNum = (int) Math.sqrt(num);
		int count = 2;
		
		while(count <= sqrtNum){
			if(num%count == 0){
				return false;
			}
			count++;
		}
		System.out.println(count);
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(primeNum(num));
	}
}