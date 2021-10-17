package Week3day1;

public class Students {
	public void getStudentInfo() {
System.out.println("get student info no argument");
	}
	
	public void getStudentInfo(int id) {
		System.out.println("get student info with id argument " +id);
			}
	public void getStudentInfo(int id, String name) {
		System.out.println("get student info with id & name argument " +id +" " +name);
			}
	public void getStudentInfo(String email, long phone) {
		System.out.println("get student info with id & name argument " +email +" " +phone);
			}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(13);
		stud.getStudentInfo(13,"sara");
		stud.getStudentInfo("test@mgail.com",123455777);

	}

}