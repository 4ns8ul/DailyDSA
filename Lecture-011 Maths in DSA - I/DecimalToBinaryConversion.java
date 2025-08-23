import java.util.Scanner;
import java.lang.Math;
class DecimaltoBinaryConversion{
	public static String decimalToBinary(long decimal){
		StringBuilder binary = new StringBuilder();
		while(decimal > 0){
			// binary = binary*10 + decimal%2;
			binary.append(decimal%2);
			decimal /= 2;
		}
		return binary.reverse().toString();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:  ");
		long decimalNum = sc.nextLong();
		
		if(decimalNum < 0) System.out.println("Please provide with correct input: ");
		if(decimalNum == 0) System.out.println("The converted binary number is:  0");
		
		System.out.println("The converted binary number is:   " + decimalToBinary(decimalNum));
	}
}