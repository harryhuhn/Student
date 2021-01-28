// Assignment #: 5
// Arizona State University - CSE205
//         Name: Harry Huhn
//    StudentID: 1219452130
//      Lecture: TTH 9:00
//  Description: This is the Graduate class. Subclass of student class (child)
public class Graduate extends Student{
	private double gradFee;
	public Graduate(String fName, String lName, String id, int credits, double rate, double graduationFee) {
		super(fName, lName, id, credits, rate);//calls on the student class contructor
		this.gradFee = graduationFee;
	}
	public void computeTuition() {
		 tuition = (rate*numCredit + gradFee);//stores the tuition rate in the protected variable
	}
	public String toString() {
		return "\nGraduate Student:"+super.toString()+"Grad Fee:\t\t$" + gf.format(gradFee) + "\n"; //super means it inherits the toString method from the Student class
	}

}
