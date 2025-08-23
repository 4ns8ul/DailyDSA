import java.util.Scanner;

public class Lecture6{
	public static void main(String[] args){
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		String age = sc.next();
		// int newAge = Integer.parseInt(age);
		
		int newAge = Integer.valueOf(age);
		
		System.out.println("Please enter your address: ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.println("Hi! " + name + " you are " + age + " years old");
		System.out.println("You live in: " + address);
		sc.close();
		*/
		
		
		//Operators in JAVA
		//1. Unary Operators
		
		int op1 = 25;
		op1++;
		System.out.println(op1);
		
		op1--;
		System.out.println(op1);
		
		int op = 15;
		int ans = op++ + ++op - --op - op++;
		System.out.println(ans);
		
		int val1 = 10;
		System.out.println(~val1); // -(val + 1) => -11
		
		int val2 = -10;
		System.out.println(~val2); // -(val + 1) => 9
		
		boolean correct = 2>3;
		System.out.println(!correct);
		
		// Ternary Operator
		System.out.println((2<3) ? "Sach hai bhai Sach" : "Dhokha hai sab");
		
		int xyz1 = 10;
		int xyz2 = 11;
		xyz1 = xyz1 = xyz1 = xyz2; // This will not result in any error. And will compiler and execute successfully
		System.out.println(xyz1);
		
		int x11 = 5;
		int x22 = (27+40) - x11++ * 5 / 2 + 9 % 100;
		System.out.println(x22);
	}
}