import java.text.DecimalFormat;
import java.text.NumberFormat;

// Assignment #: 5
// Arizona State University - CSE205
//         Name: Harry Huhn
//    StudentID: 1219452130
//      Lecture: TTH 9:00
//  Description: This is the Student class, which is the parent class for all the other classes in this assignment
public class Student {
	protected String firstName;//these are inherited by all child classes
	protected String lastName;
	protected String studentID;
	protected int numCredit;
	protected double rate;
	protected double tuition;
	protected String tuitionNum;
	public static DecimalFormat df = new DecimalFormat("###,##0.00");
	public static DecimalFormat gf = new DecimalFormat("00.00");
	//NumberFormat nf = NumberFormat.getNumberInstance();
	//private static DecimalFormat dd = new DecimalFormat(",.%2f");
	public Student(String fName, String lName, String id, int credits, double rate) {//this is the constructor for the student
		this.firstName = fName;
		this.lastName = lName;
		this.studentID = id;
		this.numCredit = credits;
		this.rate = rate;
		this.tuition = tuition;
	}
	public int getNumCredit() { //returns the number of credits taken
		return numCredit;
	}
	public void computeTuition() {
		
	}
	public String toString() {//prints out the information in the specified format
		return ("\nFirst name:\t\t"+firstName+"\n"+
				"Last name:\t\t"+lastName+"\n"+
				"Student ID:\t\t"+studentID+"\n"+
				"Credits:\t\t"+numCredit+"\n"+
				"Rate:\t\t\t"+"$"+df.format(rate)+"\n")+
				("Tuition:\t\t"+"$"+df.format(tuition)+"\n");
	}

}
