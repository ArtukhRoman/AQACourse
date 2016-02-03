import java.util.InputMismatchException;
import java.util.Scanner;


public class Lecture2 {

	public static void main(String[] args) {
		Integer a = null;
		String b = null;

		Scanner stream = CreateConsoleInputStream();
		System.out.println("Enter integer digit");
		a = GetIntInput(stream);
		System.out.println("Enter operation");
		OperationsThrowConsoleInput(CreateConsoleInputStream());
		
		
	  /*  Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.next();
		a = sc.nextInt();
		System.out.println(a);*/
	}

	private static Scanner CreateConsoleInputStream() {
		Scanner consoleIn = new Scanner(System.in);
		return consoleIn;

	}

	private static Integer GetIntInput(Scanner stream) {
		Integer value = null;		
		try {
			value = stream.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException - wrong type was inputed");
		}
		return value;
	}
	
	private static Integer OperationsThrowConsoleInput(Scanner stream) {
		
		String op = null;	
		Integer op_id =  null;
		try {
			op = stream.nextLine();
			System.out.println(op);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException - wrong type was inputed");
		}
		switch (op) {
		case "+":
			op_id = 1;
			break;
		case "-":
			op_id = 2;
			break;
		case "*":
			op_id = 3;
			break;
		case "/":
			op_id = 4;
			break;
			
		
		}
		return op_id;

	}

	
}
