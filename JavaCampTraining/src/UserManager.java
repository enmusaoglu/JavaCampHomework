
public class UserManager {
	public void addComment() {
		System.out.println("Yorum eklendi.");
	}
	public void addStudent(Student student) {
		System.out.println(student.firstName + " Kullan�c� olu�turuldu.");
		
	}
	public void deleteStudent(Student student) {
		System.out.println(student.firstName+" Kullan�c� silindi.");
	}
	
	public void logIn() {
		System.out.println(" Giri� yap�ld�.");
	}
	public void logOut() {
		System.out.println(" ��k�� yap�ld�.");
	}

	public void addCourse(Instructor instructor) {
		System.out.println(instructor.currentCourse +"Kurs eklenmi�tir.");
	}
}
