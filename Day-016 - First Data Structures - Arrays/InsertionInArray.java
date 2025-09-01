import java.util.Scanner;

class Solution{
	public static void instertInBeginning(int[] arr, int pos, int elem){
		for(int i=arr.length-2; i>=pos; i--){
			arr[i+1] = arr[i];
		}
		arr[pos] = elem;
	}
	public static void insertInBetween(int[] arr, int pos, int elem){
		for(int i=arr.length-2; i>=pos; i--){
			arr[i+1] = arr[i];
		}
		arr[pos] = elem;
	}
	public static void insertAtEnd(int[] arr, int pos, int elem){
		arr[pos] = elem;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		arr[0] = 1;
		arr[1] = 22;
		arr[2] = 333;
		
		int pos = 3;
		
		System.out.println("Please select from the menu below" );
		System.out.println("[1] Insert at the beginning of the array" );
		System.out.println("[2] Insert between elements in the array" );
		System.out.println("[3] Insert at the end of array" );
		System.out.print("[*] Please enter the element: " );
		int ch = sc.nextInt();
		
		System.out.println("Array before instertion");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if (i != arr.length-1){
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		System.out.print("Enter the element to be inserted: ");
		int elem = sc.nextInt();
		
		if(ch == 1) {
			instertInBeginning(arr, 0, elem);
		} else if (ch == 2){
			System.out.println("Enter the position within the array length: ");
			pos = sc.nextInt();
			insertInBetween(arr, pos, elem);
		} else if (ch == 3){
			insertAtEnd(arr, pos, elem);
		}
		
		System.out.println("Array after instertion");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if (i != arr.length-1){
				System.out.print(", ");
			}
		}
		
		
	}
}