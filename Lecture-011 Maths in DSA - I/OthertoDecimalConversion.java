import java.util.Scanner;
import java.lang.Math;
class OthertoDecimalConversion{
	public static long otherToDecimal(long num, long base){
		long i=0;
		long decimal = 0;
		while(num>0){
			long digit = num%10;
			decimal = decimal + digit * (long)Math.pow(base, i);
			num /= 10;
			i++;
		}
		return decimal;
	}
	
	public static boolean isnum(long num, long base){
		
		while(num>0){
			long digit = num%10;
			if(digit>base){
				return false;
			}
			num /= 10;
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:  ");
		long base = sc.nextLong();
		System.out.println("Enter a num:  ");
		long number = sc.nextLong();
		
		if(number < 0) System.out.println("Please provide with correct input");
		if(number == 0) System.out.println("The converted decimal is:  0");
		
		if(isnum(number, base)){
			System.out.println("The converted decimal num is:   " + otherToDecimal(number, base));
		} else{
			System.out.println("Please provide with correct input");
		}
	}
}