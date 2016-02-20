package Laba5;

import java.util.Arrays;

public class ContainerPerson {

	private Person container_p[];
	int item_index = 0;

	ContainerPerson(int length) {
		try {
			createContainer_p(length);
		} catch (NegativeArraySizeException e) {
			System.out.println("Size of container can't be less than 0");
		}

	}

	public void addPerson(Person person) {
		if (!isFull()) {
			try {
				container_p[item_index] = person;
				++item_index;
			} catch (NullPointerException nullpointer) {
				System.out.println("Container doesn't create yet: addPerson");
			} catch (ArrayIndexOutOfBoundsException out) {
				System.out.println("ArrayIndexOutOfBoundsException: addPerson");
			}
		}

	}

	public void findPersonByName(String name) {
		System.out.println("Search Results");
		System.out.println("============================== ");
		for (int i = 0; i < container_p.length; i++) {
			if (container_p[i].getName().equals(name)) {
				System.out.println("{Name: " + container_p[i].getName() + ", Age: " + container_p[i].getAge() + "}");
			}else{
				System.out.println("0 matches");
			}
		}

	}
	
	public void findPersonByAge(int age) {
		System.out.println("Search Results");
		System.out.println("============================== ");
		for (int i = 0; i < container_p.length; i++) {
			if (container_p[i].getAge() == age) {
				System.out.print("{Name: " + container_p[i].getName() + ", Age: " + container_p[i].getAge() + "}");
			}else{
				System.out.println("0 matches");
			}
		}

	}

	public void printStorage() {
		// Person outP[] = new Person[5];
		System.out.println("INFORMATION WAS ENTERED");
		System.out.println("============================== ");
		System.out.println("Data[");
		for (int i = 0; i < container_p.length; i++) {
			System.out.print("{Name: " + container_p[i].getName() + ", Age: " + container_p[i].getAge() + "}");
			System.out.println("");
		}
		System.out.println("]");
		// System.out.println(Arrays.deepToString(container_p));
	}

	public boolean isFull() {
		return container_p.length <= item_index;
	}

	public Person[] getContainer_p() {
		return container_p;
	}

	public void createContainer_p(int length) {

		this.container_p = new Person[length];
	}

}
