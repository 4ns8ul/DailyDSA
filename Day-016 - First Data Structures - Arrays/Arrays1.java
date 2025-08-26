import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		int[] rollNo = new int[5];
		
		int[] dummy = {1, 2, 4, 2, 3, 5};
		
		rollNo[0] = 123;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<rollNo.length; i++){
			System.out.print("Enter the elements:  ");
			rollNo[i] = sc.nextInt();
			System.out.print(rollNo[i] + " " );
		}
	}
}