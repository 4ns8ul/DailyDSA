import java.util.Scanner;

public class CalculatorAppllication {

    static Scanner sc = new Scanner(System.in);
    public static double getInteger(){
        System.out.print("[*] Enter the number: ");
        double num = sc.nextInt();
        return num;
    }

    public static double calculateFun(int choice, double num1, double num2){
        double result=0;
        switch(choice){
            case(1):
                result = num1 + num2;
                break;
            case(2):
                result = num1 - num2;
                break;
            case(3):
                result = num1 * num2;
                break;
            case(4):
                result = num1 / num2;
                break;
            case(5):
                result = Math.pow(num1, num2);
                break;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println("Welcome to the calculator program. Choose your actions from screen below");

        do{
            System.out.println("[1] Add two numbers");
            System.out.println("[2] Subtract two numbers");
            System.out.println("[3] Multiply two numbers");
            System.out.println("[4] Divide two numbers");
            System.out.println("[5] Perform exponentiation between 2 numbers");
            System.out.println("[6] Exit the program");
            System.out.print("[*] Enter your choice:   ");

            int choice = sc.nextInt();
            if (choice==6) {
                break;
            } else if(choice>=1 && choice <= 5){
                double num1 = getInteger();
                double num2 = getInteger();
                System.out.println("");
                System.out.println("[+] The result is: " + calculateFun(choice, num1, num2));
                System.out.println("");
            } else{
                System.out.println("");
                System.out.println("[-] Please enter a valid number!");
                System.out.println("");
            }
        } while(true);
    }
}