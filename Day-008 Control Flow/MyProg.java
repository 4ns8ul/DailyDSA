import java.util.Scanner;
class MyProg{
	public static void main(String[] args){
		int marks = 89;
		
		/* if(marks >= 90){
			System.out.println("You are a topepr as you secured: " + marks);
		} */
		
		if (marks > 35){
			System.out.println("Your marks are: " + marks + ", PASSED");
		}
		else{
			System.out.println("You have scored only " + marks + " marks. There's some room for improvement");
		}
		
		
		String name = "anshul";
		int len = 6;
		for (int pos=0; pos<len; pos++){
			char ch = name.charAt(pos);
		
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				System.out.println("This is a vowel " + ch);
			}
			else{
				System.out.println("This is a consonant " + ch);
			}
		}
		
		
		for(int i=1; i<=3; i++){
			
			System.out.println("");
			for(int j=1; j<=10; j++){
				System.out.println(i + " x " + j + " = " + i*j);
				if(j==6){
					continue;
				}
			}
			
		}
		
		
		int number = 2048;
		do{
			System.out.println(number);
			number /= 2;
		}while(number > 0);
	
	
	
	
		// Assignment
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of your choice:  ");
		int userNum = sc.nextInt();
		
		int count = 0;
		while(userNum>0){
			userNum /= 2;
			if(userNum/2 == 0){
				continue;
			}
			System.out.println(userNum);
			count++;
			if(count == 5){
				break;
			}
		}
	
		System.out.println("Counter: " + count);
	
	}
	
}
