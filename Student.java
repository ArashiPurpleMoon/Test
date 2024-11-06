public class Student extends StudentModel {
	
	String name = getName();
	Integer age = getAge();
	
	void introduce() {
		System.out.println("I'm " + name + ", " + String.valueOf(age) + " years old.");
	}
}