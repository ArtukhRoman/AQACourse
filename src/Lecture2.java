import java.util.InputMismatchException;
import java.util.Scanner;

import sun.font.CreatedFontTracker;

public class Lecture2 {

	public static void main(String[] args) {
		Integer a = null;

		Scanner stream = CreateConsoleInputStream();
		System.out.println("Enter integer digit");
		a = GetIntInput(stream);
		System.out.println(a);
	}

	private static Scanner CreateConsoleInputStream() {
		Scanner concoleIn = new Scanner(System.in);
		return concoleIn;

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

}
