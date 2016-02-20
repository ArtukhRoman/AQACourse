package Laba5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CosoleInputReader {

	private Scanner input_stream;

	CosoleInputReader() {
		CreateConsoleInputStream();
	}

	private void CreateConsoleInputStream() {
		this.input_stream = new Scanner(System.in);
	}

	public String readName() {

		System.out.println("Enter person's name:");
		return input_stream.nextLine();
	}
	
	public String readConsoleString() {
		return input_stream.nextLine();
	}
	

	public int readConsoleInt() {

		Integer age = null;
		System.out.println("Enter person's age:");

		try {
			age = Integer.parseInt(input_stream.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException - wrong type was inputed");
		}

		return age;
	}

	public int readConsoleSubMenu() {

		Integer age = null;
		try {
			age = Integer.parseInt(input_stream.nextLine());		System.out.println( "SUBMENU START");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException - wrong type was inputed");
		}

		clean();
		return age;
	}

	public void clean() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\r\n");
		}

	}

}
