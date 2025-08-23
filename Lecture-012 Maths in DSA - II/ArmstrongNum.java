import java.util.Scanner;
class Program{
	static boolean armstrongNum(int num1){
		int num2=num1;
		int armNum=0;
		int temp=0;
		
		if(num2==0) return true;
		while(num2 > 0){
			temp = num2%10;
			armNum = armNum +(temp*temp*temp); //Or Math.pow(temp, 3)
			num2 /= 10;
		}
		
		if(armNum == num1) return true;
		return false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(armstrongNum(num));
	}
}