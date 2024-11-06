public class Main {
	
    public static void main(String[] args) {
        
		Teacher jack = new Teacher();
		jack.setId(1);
		jack.setName("Jack");
		jack.setAge(35);
		jack.setSubject("Math");
		
		Student annie = new Student();
		annie.setId(1);
		annie.setName("Annie");
		annie.setAge(16);
		
		Student john = new Student();
		john.setId(2);
		john.setName("John");
		john.setAge(17);
		
		jack.introduce();
		annie.introduce();
		john.introduce();
    }
}