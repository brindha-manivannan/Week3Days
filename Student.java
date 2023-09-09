package week3day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Brindha Manivannan");
	}
	public void studentDept() {
		System.out.println("CSC");
	}
	public void studentID() {
		System.out.println("12345");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student br =new Student();
	   br.collegeCode();
	   br.collegeName();
	   br.collegeRank();
	   br.deptName();
	   br.studentDept();
	   br.studentID();
	   br.studentName();

	}

}
