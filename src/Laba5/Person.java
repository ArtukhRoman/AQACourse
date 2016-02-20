package Laba5;

public class Person {
	
	private String name;
	private Integer age;
	
	
	Person(String name, Integer age){
	  setName(name);
	  setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
