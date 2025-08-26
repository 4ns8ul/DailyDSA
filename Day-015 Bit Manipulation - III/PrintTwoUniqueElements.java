import java.util.Scanner;

class Solution{
	
	public static void printTwoUniqueElements(int arr[]){
		int uniqueNum = 0;
		for(int bitPos=0; bitPos<32; bitPos++){
			int bitSum = 0;
			
		}
	}
	
	public static void main(String[] args){
		int[] arr1 = {7, 4, 2, 4, 6, 8, 6, 1, 1, 8};
		
		
		printTwoUniqueElements(arr1);
		
		System.out.println((2>>1) & 1);
		
	}
	
	public static void printTwoUniqueElements(int arr[]){
		int len = arr.length;
		int res = 0;
		for(int i=0; i<len; i++){
			res = res ^ arr[i];
		}
		
		int setBit = 0;
		int bit = 0
		while(res != 0){
			if(((res>>bit) & 1) != 0){
				setBit = bit;
				break;
			}
			bit++;
		}
		// TO BE COMPLETED
	}
}
