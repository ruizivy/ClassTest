import java.util.ArrayList;
import java.util.List;

public class Student {

	private String fName;
	private String lName;
	private String studentNo;
	private Gender gender;
	private String courseName;
	
	public static int subjectCounter = 0;
	
	private List<Subject> subjects;
	
	public Student(String f, String l, String s, Gender g, String c) {
		this.fName = f;
		this.lName = l;
		this.studentNo = s;
		this.gender = g;
		this.courseName = c;
		
		subjects = new ArrayList<Subject> ();
	}
	
	public void AddSubject(String code, String name, int units,
						  double p, double m, double f) {
		subjects.add(new Subject(code, name, units));
		
		subjects.get(subjectCounter).SetGrade(p, m, f);
		subjectCounter++;
	}

	public void PrintAllSubjects() {
		for(Subject s : subjects) {
			s.PrintSubjectDetails();
		}
	}
	
	public void SumAllUnits() {
		int total = 0;
		for(Subject s : subjects) {
			total = total + s.GetUnits();
		}
		System.out.println("Total units is : " + total);
	}
	
	
	public void PrintStudentDetails() {
		System.out.println("Full Name : " + this.fName + " " + this.lName);
		System.out.println("Student no: " + this.studentNo);
		System.out.println("Course : " + this.courseName);
		System.out.println("Gender : " + (gender == Gender.MALE ? 
										"Male" : "Female"));
	}
	
	
}
