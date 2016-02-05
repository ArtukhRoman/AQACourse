import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture3 {

	private static boolean enough;
	private static int[] array;
	private static Scanner input_stream;
	private static Integer console_number;
	private static int counter;


	public static void main(String[] args) {
		 
		
		  setArray(new int [10]);
		  setEnough(false);
		  setInput_stream(CreateConsoleInputStream()); 
		  System.out.println("Please, enter some digit set");
		  arrayFiller();
          System.out.println("There is 10 numbers < 10 from the inputed sequence");
		  System.out.println(Arrays.toString(getArray()));

	}

	private static void arrayFiller() {
		 console_number = null;
		 counter = 0;
		 while (!isEnough()) {
	     console_number = GetIntInput(getInput_stream());
	     
		  if (console_number < 10) {
			  
				//System.out.println("a<10");
				if (counter < array.length) {
					array[counter] = console_number;
					counter++;
					//System.out.println("b = " + counter);
				} else {
					setEnough(true);
					System.out.println("enogh " + isEnough());
				  }
			}
		  
		  }
		
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

	public static boolean isEnough() {
		return enough;
	}

	public static void setEnough(boolean enough) {
		Lecture3.enough = enough;
	}

	public static int[] getArray() {
		return array;
	}

	public static void setArray(int[] array) {
		Lecture3.array = array;
	}

	public static Scanner getInput_stream() {
		return input_stream;
	}

	public static void setInput_stream(Scanner input_stream) {
		Lecture3.input_stream = input_stream;
	}

}
