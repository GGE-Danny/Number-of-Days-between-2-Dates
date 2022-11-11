package Locumator;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class numDays {

	
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter dates in dd-MMM-yyyy format e.g 11-Nov-2022\n");
	
		System.out.println("Enter the 1st Date :");
		String date = in.next();
		
		System.out.println("Enter the 2nd Date:");
		String date1 = in.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		
		  Date date2 = dateFormat.parse(date);
		  Date  date3 = dateFormat.parse(date1);

		long diff = date3.getTime() - date2.getTime();

		System.out.println("The difference between  " + date + " and "+ date1+" is "
		        + (Math.abs(diff) / (1000 * 60 * 60 * 24)) + " days.");

in.close();
	}

	

}
