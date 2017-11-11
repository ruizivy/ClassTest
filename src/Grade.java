
public class Grade {
	
	private double prelim;
	private double midterm;
	private double finals;
	private double average;
	
	public Grade(double p, double m, double f){
		this.prelim = (p >= 0? p : 0);
		this.midterm = (m >= 0? m : 0);
		this.finals = (f >= 0? f : 0);
		
		this.average = (f + m + p) / 3;
	}
	
	public void PrintGrades() {
		System.out.println("Prelim : " + this.prelim);
		System.out.println("Midterm : " + this.midterm);
		System.out.println("Finals : " + this.finals);
		System.out.printf("Average %.2f\n", this.average);
	}
	
	
}
