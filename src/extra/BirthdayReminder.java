//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		
		// 1. OPTION: correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "November 30th";

		// 2. Find out whose birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("Who's birthday do you need?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, Birthday);
		// 4. if user asked for "mom"
		if(Birthday == "Mom") {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(Birthday == "Dad") {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for you
		if(Birthday == "Ryan") {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

}
