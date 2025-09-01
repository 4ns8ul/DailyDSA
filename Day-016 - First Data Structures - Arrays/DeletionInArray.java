import java.util.Scanner;

class Solution{
	public static void deletionInBeginning(int[] arr, int pos){
		for(int i=pos; i<=arr.length-2; i++){
			arr[i] = arr[i+1];
			pos++;
		}
		arr[pos] = 0;
	}
	public static void deletionInBetween(int[] arr, int pos){
		for(int i=pos; i<=arr.length-2; i++){
			arr[i] = arr[i+1];
			pos++;
		}
		arr[pos] = 0;
	}
	public static void deletionAtEnd(int[] arr, int pos){
		arr[pos] = 0;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		arr[0] = 1;
		arr[1] = 22;
		arr[2] = 333;
		
		int pos = 2;
		
		System.out.println("Please select from the menu below" );
		System.out.println("[1] Delete at the beginning of the array" );
		System.out.println("[2] Delete between elements in the array" );
		System.out.println("[3] Delete at the end of array" );
		System.out.print("[*] Please enter the element: " );
		int ch = sc.nextInt();
		
		System.out.println("Array before deletion");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if (i != arr.length-1){
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		
		if(ch == 1) {
			deletionInBeginning(arr, 0);
		} else if (ch == 2){
			System.out.println("Enter the position within the array length: ");
			pos = sc.nextInt();
			deletionInBetween(arr, pos);
		} else if (ch == 3){
			deletionAtEnd(arr, pos);
		}
		
		System.out.println("Array after deletion");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if (i != arr.length-1){
				System.out.print(", ");
			}
		}
		
		
	}
}
