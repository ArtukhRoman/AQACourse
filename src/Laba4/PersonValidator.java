package Laba4;

public class PersonValidator {
	
	 public boolean isAge(Integer age) {
	        return (age > 1 && age < 99);
	    }

	 public boolean isName(String name) {
	       return (name.length() >= 3 );
	    }

}
