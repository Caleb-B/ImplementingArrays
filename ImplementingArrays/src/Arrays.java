// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;

public class Arrays
{  // begin class
	
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	
		final int MAXSIZE = 1000;
		
	// ***** declaration of variables *****
		
		String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";                 // delimiter string for splitting input string
        String nl = System.lineSeparator();     // new line character
        
        int[] list = new int[MAXSIZE];  							// declare and instatiate the array
       
        int count = 0;
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// create instances of objects for i/o and formatting
        
    	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("arrayData.txt")));
    	
    	listFile(out);
    	
		out.close();
    	
    	BufferedReader fin = null;		// file buffer
        
        try{
        	fin = new BufferedReader(new FileReader("arrayData.txt"));
        } // end try
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"file not found");
        } // end catch
        
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
    	
	// ***** Print Banner *****
	
		Printer.printBanner("Assignment 1: Implementing Arrays");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
		
		count = loadList(list, fin);
        
        System.out.println("array length: " + count);
	
	// ***** processing *****
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		fout.write("");

	// ***** closing message *****
	
		Printer.printClosing();
		fout.close();
	
	}  // end main	
	
	//************************************************
    // Purpose: Write a list with random length
	//			between 950 and 1000 to data file
    // Interface: IN: input print writer
    // Returns: none
    // *****************************************************
	public static void listFile(PrintWriter p) {
		Random Rand = new Random();
		int rand = 950 + Rand.nextInt(50);
		
		int length = 0;
		
		while (length < rand) {
			p.write((1 + Rand.nextInt(100)) + " ");
			if (length % 5 == 4) {
				p.write("\n");
			}
			length++;
		}
	}  // end list file
	
	//************************************************
    // Purpose: Write a list from the data file
    // Interface: IN: input buffered reader, list
    // Returns: n, actual number of list values
    // *****************************************************
	public static int loadList(int[] l, BufferedReader f) throws IOException {
		int n = 0;
		int c = 0;
		
		String[] tokens;
		String delimit = "[ ]+";
		
		String sIn = f.readLine();   	// prime loop
		
        while (sIn != null) {
        	tokens = sIn.split(delimit);
        	for (int i = 0; i < 5; i++) {
        		try {
        			l[n] = Integer.parseInt(tokens[i]);
            		c = Integer.parseInt(tokens[i]);
            	}
            	catch(ArrayIndexOutOfBoundsException e){
            		JOptionPane.showMessageDialog(null,"index out of range");
            		//System.out.println(n);
            		break;
            	}
        		//System.out.println(l[n]);
            	n++;				// count actual array elements
        	}
        	
        	try {
        		l[n] = c;
        	}
        	catch(ArrayIndexOutOfBoundsException e){
        		break;
        	}
        	// System.out.println(strin);
        	sIn = f.readLine();
        	
        } // end eof
		return n;
	}  // end of load list
	
}  // end class