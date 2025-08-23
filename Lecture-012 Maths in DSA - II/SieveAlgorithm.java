import java.util.Arrays;
import java.util.Scanner;
class Program{
	static int SieveAlgorithm(int num){
		boolean[] arr = new boolean[num+1];
		Arrays.fill(arr, true);
		
		int count = 2;
		while(count<=num){
			if(arr[count] == true){
				for(int factor=count*2; factor<=num; factor+=count){
					arr[factor] = false;
				}
			}
			count++;
		}
		
		int cnt=0;
		for(int i=2; i<arr.length; i++){
			if(arr[i] == true){
				System.out.println(i);
				cnt++;
			}
		}
		return cnt;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		SieveAlgorithm(num);
	}
}