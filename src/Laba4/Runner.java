package Laba4;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		String name;
		int age;

		ContainerPerson cont = new ContainerPerson(2);
		CosoleInputReader input_data = new CosoleInputReader();
		while (!cont.isFull()) {
			name = input_data.readConsoleString();
			age = input_data.readConsoleInt();
			Person p = new Person(name, age);
			cont.addPerson(p);
		}
		
		input_data.clean();

		
		cont.printStorage();

	}
	
	
}
