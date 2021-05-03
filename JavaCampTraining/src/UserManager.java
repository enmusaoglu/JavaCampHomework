
public class UserManager {
	public void addComment() {
		System.out.println("Yorum eklendi.");
	}
	public void addStudent(Student student) {
		System.out.println(student.firstName + " Kullanýcý oluþturuldu.");
		
	}
	public void deleteStudent(Student student) {
		System.out.println(student.firstName+" Kullanýcý silindi.");
	}
	
	public void logIn() {
		System.out.println(" Giriþ yapýldý.");
	}
	public void logOut() {
		System.out.println(" Çýkýþ yapýldý.");
	}

	public void addCourse(Instructor instructor) {
		System.out.println(instructor.currentCourse +"Kurs eklenmiþtir.");
	}
}
