
public class Subject {

	private String subjectCode;
	private String subjectName;
	private int units;
	private Grade grade;
	
	
	/**
	 * This is the Subject constructor
	 * @param sCode
	 * @param sName
	 * @param units
	 */
	public Subject(String sCode, String sName, int units) {
		this.subjectCode = sCode;
		this.subjectName = sName;
		this.units = ( units >= 0 ? units : 0);
	}
	
	public void SetGrade(double p, double m, double f) {
		grade = new Grade(p, m, f);
	}
	
	public int GetUnits() {
		return this.units;	
	}
	
	public void PrintSubjectDetails() {
		System.out.println("Subject Code : " + this.subjectCode);
		System.out.println("Subject name : " + this.subjectName);
		System.out.println("Units : " + this.units );
		grade.PrintGrades();
	}
	
	
	
}
