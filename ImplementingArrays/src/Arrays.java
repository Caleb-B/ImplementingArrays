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
	
		final int MAXSIZE = 100;
		
	// ***** declaration of variables *****
	
		Random Rand = new Random();
		int[] list = new int[100];
		int i = 0;
		int rand = Rand.nextInt(50);
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// create instances of objects for i/o and formatting
        
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("arrayData.txt")));
    	
    	BufferedReader fin = new BufferedReader(new FileReader("arrayData.txt"));
    	
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("Assignment 1: Implementing Arrays");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		while (i < 950 + rand) {
			fout.write(Integer.toString(1 + Rand.nextInt(100)) + " ");
			if (i % 5 == 4) {
				fout.write("\n");
			}
			i ++;
		}
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		fout.write("");

	// ***** closing message *****
	
		Printer.printClosing();
		fout.close();
	
	}  // end main	
}  // end class