import java.util.Scanner;
class FastExponentiation{
	static double fastExpFun(int num, int exp){
		double result = 1;
		while(exp > 0){
			if(exp%2!=0){
				result = (result*num);
			}
		
			exp /=2;
			num=num*num;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int exp = sc.nextInt();
		
		System.out.println(fastExpFun(num, exp));
		
	}
}