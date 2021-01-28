import java.util.ArrayList;

// Assignment #: 5
// Arizona State University - CSE205
//         Name: Harry Huhn
//    StudentID: 1219452130
//      Lecture: TTH 9:00
//  Description: This is the stuparser class, utility class to the student class
public class StuParser  {
	
	public static Student parseStringToStudent(String lineToParse) {
		String[] info = new String[8];
		info = lineToParse.split("/");//splits the string up into substrings where theres a /
		if(info[0].equals("UnderGrad")) { //.equals method checks to see if the two strings are equal
			
			int credits = Integer.parseInt(info[4]); //parse turns the string into an integer
			double rate = Double.parseDouble(info[5]);
			boolean inState;
			String stateStatus = info[6].toLowerCase();//stores the string of instate as lowercase
			if(stateStatus.equals("instate")) {//if the lowercase string says they're in state student
				inState = true;
			}
			else {
				inState = false;
			}
			//boolean inState = Boolean.parseBoolean(info[6]);
			double programFee = Double.parseDouble(info[7]);
			UnderGrad undergrad = new UnderGrad(info[1], info[2], info[3], credits, rate, inState, programFee); //takes the information and creats undergraduate object
			return undergrad;
		}
		else if(info[0] == ("Graduate")) {//i forgot to change this to .equals after changing the previous part of the if statement but it still works so i left it be
			int credits = Integer.parseInt(info[4]);
			double rate = Double.parseDouble(info[5]);
			double gradFee = Double.parseDouble(info[6]);
			Graduate graduate = new Graduate(info[1], info[2], info[3], credits, rate, gradFee);
			return graduate;
		}
		else {
			int credits = Integer.parseInt(info[4]);
			double rate = Double.parseDouble(info[5]);
			double gradFee = Double.parseDouble(info[6]);
			Graduate graduate = new Graduate(info[1], info[2], info[3], credits, rate, gradFee);
			return graduate;
			
			
		}

	}

}
