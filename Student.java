package Week3day1;
  public class Student extends Department {
		
		public void studentName() {
	System.out.println("student Name");
		}
		public void studentDept() {
			System.out.println("student Dept");
				}
		public void studentId() {
			System.out.println("student Id");
				}

		public static void main(String[] args) {
			College coll = new College();
			Department depart = new Department();
			Student stud = new Student();
			coll.collegeName();
			coll.collegeCode();
			coll.collegeRank();
			depart.deptName();
			stud.studentName();
			stud.studentDept();
			stud.studentId();
		
			
		}
	}

