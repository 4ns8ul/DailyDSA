import java.util.Scanner;
import java.lang.Math;
class DecimaltoBinaryConversion{
	public static long binaryToDecimal(long binary){
		long i=0;
		long decimal = 0;
		while(binary>0){
			long digit = binary%10;
			decimal = decimal + digit * (long)Math.pow(2, i);
			binary /= 10;
			i++;
		}
		return decimal;
	}
	
	public static boolean isBinary(long binary){
		
		while(binary>0){
			long digit = binary%10;
			if(digit !=0 && digit != 1){
				return false;
			}
			binary /= 10;
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:  ");
		long binaryNum = sc.nextLong();
		
		if(binaryNum < 0) System.out.println("Please provide with correct input: ");
		if(binaryNum == 0) System.out.println("The converted decimal is:  0");
		
		if(isBinary(binaryNum)){
			System.out.println("The converted decimal number is:   " + binaryToDecimal(binaryNum));
		}
	}
}