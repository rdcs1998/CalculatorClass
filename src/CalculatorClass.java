
import java.util.Scanner;
public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int Operation=0;
		int nextOp=0;
		while(nextOp != 2) {
			int num1;
			int num2;
			nextOp=0;
			System.out.println("Please insert your first number");
			num1= scan.nextInt();
			System.out.println("Insert your second number");
			num2 = scan.nextInt();
			while (Operation<1 || Operation >4) {
				System.out.println("What operation would you like to perform?\n"
									+"1.Add\n"
									+"2.Subtract\n"
									+"3.Multiply\n"
									+"4.Divide");
				Operation = scan.nextInt();
			}
			switch(Operation) {
			case 1:
				System.out.println(Add(num1,num2));
				break;
			case 2:
				System.out.println(Sub(num1,num2));
				break;
			case 3:
				System.out.println(Multiply(num1,num2));
				break;
			case 4:
				System.out.println(Divide(num1,num2));
				break;
			}
			while (nextOp!=1 || nextOp != 2)
			System.out.println("Would you like to do another operation?\n"
					+"1.Yes\n"
					+"2.No");
			nextOp=scan.nextInt();
		}
		System.out.println("Thanks for calculating stuff");

	}
	
	public static int Add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int Sub(int num1, int num2) {
		return (num1-num2);
	}
	
	public static int Multiply(int num1, int num2) {
		return (num1*num2);
	}
	
	public static int Divide(int num1, int num2) {
		return (num1/num2);
	}


}
