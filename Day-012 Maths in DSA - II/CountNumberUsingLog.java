import java.lang.Math;
import java.util.Scanner;
class Program{
	static int countNumberUsingLog(int num){
		if(num==0) return 1;
		// int countLog = (int) Math.log10(num) + 1;
		int countLog = (int) (Math.log(num)/Math.log(10))+1;
		return countLog;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(countNumberUsingLog(num));
	}
}