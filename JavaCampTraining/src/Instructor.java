
public class Instructor extends User{
	
	String currentCourse;
	public Instructor(int id,String lesson, String email,String currentCourse) {
		super(id, email, email);
		this.id=id;
		this.currentCourse=currentCourse;
		this.email=email;
		this.lesson=lesson;
	}

}
