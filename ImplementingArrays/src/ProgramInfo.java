/* **********************************************************
 * Programmer:	Caleb Beynon
 * Class:		CS30S
 * 
 * Assignment:	Exercise 2.1
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class ProgramInfo
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
	 private String banner = "**********************************\n"
	 		+ "NAME:        Caleb Beynon\n"
	 		+ "Class:       CS30S\n"
	 		+ "Assignment:  \n"
	 		+ "**********************************\n";		// banner output
	 
	 private String closing = "end of processing\n";		// closing message
	 
 	// ********** constructors ***********
	 
	 /*******************************************************
	  *Purpose: 		create new info object with
	  *					default properties
	  *Interface:
	  *	in:			none
	  *	out:		none
	  *******************************************************/
	 public ProgramInfo() {
	 } // end of default constructor
	 
 	// ********** accessors **********
	 
	 /*******************************************************
	  *Purpose: 		get the banner
	  *Interface:
	  *	in:			none
	  *	out:		banner (String)
	  *******************************************************/
	 public String getBanner(String exercise) {
		 return ("**********************************\n"
			 		+ "NAME:        Caleb Beynon\n"
			 		+ "Class:       CS30S\n"
			 		+ "Assignment:  " + exercise + "\n"
			 		+ "**********************************\n");		// return banner
	 } // end getBanner()
	 
	 /*******************************************************
	  *Purpose: 		get the closing message
	  *Interface:
	  *	in:			none
	  *	out:		closing message (String)
	  *******************************************************/
	 public String getClosing() {
		 return closing;	// return closing message
	 } // end getClosing()
	 
	 /*******************************************************
	  *Purpose: 		prints banner
	  *Interface:
	  *	in:			none
	  *	out:		none
	  *******************************************************/
	 public void printBanner() {
		 System.out.println(banner);
	 } // end default printBanner()
	 
	 /*******************************************************
	  *Purpose: 		prints banner with modified
	  *					assignment and question
	  *					numbers
	  *Interface:
	  *	in:			assignment number (String), 
	  *				question number (String)
	  *	out:		none
	  *******************************************************/
	 public void printBanner(String assignmentNum, String questionNum) {
		 System.out.println("**********************************\n"
			 		+ "NAME:        Caleb Beynon\n"
			 		+ "Class:       CS30S\n"
			 		+ "Assignment:  " + assignmentNum + " " + questionNum + "\n"
			 		+ "**********************************\n");
	 } // end assignment printBanner()
	 
	 /*******************************************************
	  *Purpose: 		prints exercise banner
	  *Interface:
	  *	in:			exercise (String)
	  *	out:		none
	  *******************************************************/
	 public void printBanner(String exercise) {
		 System.out.println("**********************************\n"
			 		+ "NAME:        Caleb Beynon\n"
			 		+ "Class:       CS30S\n"
			 		+ "Assignment:  " + exercise + "\n"
			 		+ "**********************************\n");
	 } // end exercise printBanner()
	 
	 /*******************************************************
	  *Purpose: 		prints closing
	  *Interface:
	  *	in:			none
	  *	out:		none
	  *******************************************************/
	 public void printClosing() {
		 System.out.println(closing);
	 } // end printClosing()
	 
 	// ********** mutators **********
 
 }  // end class