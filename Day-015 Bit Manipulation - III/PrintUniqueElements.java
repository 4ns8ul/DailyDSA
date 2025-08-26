import java.util.Scanner;

class Solution{
	
	public static void printUniqueElements(int arr[]){
		int len = arr.length;
		int res = 0;
		for(int i=0; i<len; i++){
			res = res ^ arr[i];
		}
		
		System.out.println(res);
	}
	
	public static void main(String[] args){
		int[] arr = {4, 2, 4, 6, 8, 6, 1, 1, 8};
		
		printUniqueElements(arr);
		
	}
}
