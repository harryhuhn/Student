// Assignment #: 5
// Arizona State University - CSE205
//         Name: Harry Huhn
//    StudentID: 1219452130
//      Lecture: TTH 9:00
//  Description: This is the undergrad class, child class to the student class
public class UnderGrad extends Student{
	private boolean inState;
	private int creditUpperbound;
	private double programFee;
	
	public UnderGrad(String fName, String lName, String id, int credits, double rate, boolean inState, double programFee) {
		super(fName, lName, id, credits, rate);//calls on the student class contructor
		this.inState = inState;
		this.programFee = programFee;
		if(inState) { //if true
			creditUpperbound = 7;
		}
		else { //if false
			creditUpperbound = 12;
		}
	}
	public void computeTuition() {
		if(numCredit >= creditUpperbound) { //if the number of credits is at the credit boundary or above
			tuition = rate*creditUpperbound + programFee;
		}
		else { //otherwise, if it is below the upper bound
			tuition = rate*numCredit + programFee;
		}
	}
	public String toString() {
		if(inState) {//if the student is in state
			return "\nUnderGrad:"+"\nIn-State"+super.toString()+"Student Program Fee:\t$" + df.format(programFee) + "\n";
		}
		else {//if the student is out of state
			return "\nUnderGrad:"+"\nOut-Of-State"+super.toString()+"Student Program Fee:\t$" + df.format(programFee) + "\n";
		}
	}

}
