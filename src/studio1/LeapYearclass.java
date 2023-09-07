package studio1;

import java.util.Scanner;

public class LeapYearclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int LeapYear = in.nextInt();
		boolean isDivisible = (LeapYear % 4 == 0 && LeapYear % 100 != 0 || LeapYear % 400 == 0);
		System.out.println(LeapYear+ " is a leap year: "+ isDivisible);

	}

}
