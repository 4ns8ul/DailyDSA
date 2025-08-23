import java.util.Scanner;
import java.lang.Math;
class DecimaltoOtherConversion{
	public static String decimalToOther(long decimal, int base){
		StringBuilder num = new StringBuilder();
		while(decimal > 0){
			// binary = binary*10 + decimal%2;
			num.append(decimal%base);
			decimal /= base;
		}
		return num.reverse().toString();
	}
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base number:  ");
		int base = sc.nextInt();
		System.out.println("Enter a decimal number:  ");
		long num = sc.nextLong();
		
		if(num < 0) System.out.println("Please provide with correct input: ");
		if(num == 0) System.out.println("The converted binary number is:  0");
		
		System.out.println("The converted binary number is:   " + decimalToOther(num, base));
	}
}