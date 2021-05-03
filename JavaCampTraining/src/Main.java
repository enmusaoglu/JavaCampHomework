
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1, "xyz@gmail.com", "JAVA", "Enes", "MUSAOĞLU");
		Student student2 = new Student(2,"www@gmail.com","C#","Selin","Kurtcuoğulları");
		Instructor instructor = new Instructor(1, "Java & C#", "engindemirog@gmail.com", "Java");
		
		
		UserManager userManager = new UserManager();
		userManager.addStudent(student1);
		userManager.addStudent(student2);
		userManager.deleteStudent(student1);
		userManager.deleteStudent(student2);
		userManager.logIn();
	}

}
