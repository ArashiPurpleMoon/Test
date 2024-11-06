public class Teacher extends TeacherModel {
	
	String name = getName();
	Integer age = getAge();
	String subject = getSubject();
	
	void introduce() {
		System.out.println("I'm " + name + ", " + String.valueOf(age) + " years old, teaching subject is " + subject + ".");
	}
}