// The program can be used to convert array or String to integer with basic Maths operation

import java.util.Scanner;
class shiftTheNumbers{
	public static int shiftNum(int[] nums){
		int result = 0;
		for(int i=0; i<nums.length; i++){
			result = result*10 + nums[i];
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array length:  ");
		int len = sc.nextInt();
		int[] nums = new int[len];
		for(int i=0; i<len; i++){
			nums[i] = sc.nextInt();
		}
		System.out.println("The input array is:  ");
		for(int i=0; i<len; i++){
			System.out.println(nums[i]);
		}
		System.out.print("Resultant integer: " + shiftNum(nums));
	}
}