import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static Scanner in = new Scanner(System.in);
	private static void Print( String s) {
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		
		//Student s = new Student("John", "Locke", "16-0001", 
		//						Gender.MALE, "BSCS");
		
		//s.PrintStudentDetails();
		
		Student [] students = new Student[1];
	
		try {
			for(int i = 0; i < students.length; i++) {
				Print("Enter first name : " );
				String fname = input.readLine();
				Print("Enter last name : " );
				String lname = input.readLine();
				Print("Enter student no : " );
				String studNo = input.readLine();
				Print("Enter course  : " );
				String course = input.readLine();
				
				students[i] = new Student(fname, lname, studNo, 
											Gender.MALE, course);
				ProcessGrades(students[i]);
				
			}
		}catch(Exception e) {
			
		}
		for(Student s : students) {
			s.PrintStudentDetails();
			s.PrintAllSubjects();
			s.SumAllUnits();
			
		}
	}
	
	public static void ProcessGrades(Student s) {
		try {
			Print("Enter a subject or -1 to stop : ");
			String subject = input.readLine();
			
			while (!(subject.equals("-1"))) {
				Print("Enter subject code  : " );
				String subjectCode = input.readLine();
				Print("Enter units : ");
				String units = input.readLine();
				
				
				Print("Enter prelim, midterm and finals : " );
				double prelim = in.nextDouble();
				double midterm = in.nextDouble();
				double finals = in.nextDouble();
				
				s.AddSubject(subjectCode, subject, 
							Integer.parseInt(units), 
							prelim, midterm, finals);
				Print("Enter a subject or -1 to stop : ");
				subject = input.readLine();
			}
		}catch (Exception e) {
			
		}
		
	}
	


}
