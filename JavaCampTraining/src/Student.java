
public class Student extends User{

	String firstName;
	String lastName;
	
	public Student(int id, String email,String lesson ,String firstName,String lastName) {
		super(id, email,lesson);
		this.firstName=firstName;
		this.lastName=lastName;
		this.lesson=lesson;
	}
	
}
