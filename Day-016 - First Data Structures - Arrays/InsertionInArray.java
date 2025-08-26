import java.util.Scanner;

class Solution{
	
	public static void insertInBetween(int[] arr, int elem, int pos){
		for(int i=arr.length-2; i>pos; i--){
			arr[i+1] = arr[i];
		}
		
		arr[pos] = elem;
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int pos = sc.nextInt();
		int elem = sc.nextInt();
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[3] = 4;
		arr[4] = 8;
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		insertInBetween(arr, elem, pos);
	}
}