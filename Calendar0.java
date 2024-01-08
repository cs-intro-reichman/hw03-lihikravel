
public class Calendar0 {	
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month < 13; month++){
			 System.out.println("Month " + month + "has " + nDaysInMonth(month, year) + " days");
			

		}
		
	}

	
	public static boolean isLeapYear(int year) {
	 boolean isLeapYear = ((year % 400) == 0);
	 isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	 }
 
	
	 
	
	public static int nDaysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else{
			if (isLeapYear(year) == true)return 29;
			else return 28;
		}
	}	
	
}
